<script context="module">
	export async function load({ page, fetch }) {
		const { slug } = page.params;
		const res = await fetch(`/entries/${slug}.json`).then((r) => r.json())
		if (res.content) {
			return {
				props: { entry: res, slug }
			}
		} else {
			return {
				props: {
					entry: null, slug
				}
			}
		}
	}
    
</script>

<script>
	import marked from 'marked/src/marked.js';
	import BookLayout from '$lib/BookLayout.svelte'

    export let slug;
    export let entry;

	let markup;
	$: {
		if (entry) markup = marked(entry.content)
	}
</script>

<svelte:head>
	<title>Entry on {slug}</title>
</svelte:head>

<h1>{slug}</h1>
<p>{JSON.stringify(entry)}</p>
<a href='/editor/{slug}'>Edit entry</a>

<BookLayout>
	{#if entry}
		{@html markup}
	{:else}
		<a href='/editor/{slug}'>Create journal post</a>
	{/if}
</BookLayout>