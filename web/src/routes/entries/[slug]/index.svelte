<script context="module">
	export async function load({ page, fetch }) {
		const { slug } = page.params;
		const entry = await fetch(`/entries/${slug}.json`).then((r) => r.json())
		return {
		props: { entry, slug }
		}
	}
    
</script>

<script>
	import marked from 'marked';

    export let slug;
    export let entry;

	$: markup = marked(entry.content);
</script>

<svelte:head>
	<title>Entry on {entry.date}</title>
</svelte:head>

<h1>{slug}</h1>
<p>{JSON.stringify(entry)}</p>
<h2>Markup below</h2>
<main>
	{@html markup}
</main>

<style>
	main {
		background-color: #fbfbfb;
		width: 98%;
		max-width: 600px;
		height: 500px;
		margin: 0 auto;
		padding: 20px;
	}
</style>