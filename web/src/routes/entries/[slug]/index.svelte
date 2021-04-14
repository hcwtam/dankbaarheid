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

<BookLayout date={slug}>
	{#if entry}
		{@html markup}
	{/if}
	<a href='/editor/{slug}'>
		<img src='/edit.svg' alt='edit button' />
	</a>
</BookLayout>

<style>
	img {
		top: 20px;
		right: 25px;
		position: absolute;
		width: 45px;
		height: 45px;
		cursor: pointer;
		transition: 0.1s all ease-out;
		background-color: rgb(245, 245, 245);
		border-radius: 5px;
		padding: 10px;
	}

	img:hover {
		transform: scale(1.1);
		background-color: rgb(235, 235, 235);
	}

	h1 {
		padding: 0 20px;
	}
</style>