<script context="module">
	import * as api from '$lib/api.js';
	export async function load({ page }) {

		const { slug } = page.params;
		const entry = await api.get(`entries/${slug}`, null);
		return {
			props: { entry, slug }
		};
	}
</script>

<script>
	import Editor from './_Editor.svelte';
	export let slug;
	export let entry;
</script>

<Editor {entry} {slug}/>