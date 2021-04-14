<script context="module">
	import * as api from '$lib/api.js';
	export async function load({ page }) {

		const { slug } = page.params;
		const entry = await api.get(`entries/${slug}`, null);
		if (entry.content) {
			return {
				props: { entry, slug }
			}
		} else {
			return {
				props: { entry: null, slug }
			};
		}
	}
</script>

<script>
import BookLayout from '$lib/BookLayout.svelte';

	import Editor from './_Editor.svelte';
	export let slug;
	export let entry;
</script>

<svelte:head>
	<title>Edit Entry on {slug}</title>
</svelte:head>

<h1>Writing entry on {slug}</h1>
<BookLayout date={slug}>
	<Editor {entry} {slug}/>
</BookLayout>

<style>
	h1 {
		padding: 0 20px;
	}
</style>