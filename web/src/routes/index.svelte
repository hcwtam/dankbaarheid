<script context="module">
	export async function load({ fetch }) {
		const entries = await fetch('/entries').then((r) => r.json())
		return {
		props: { entries }
		}
	}
    
</script>

<script>
	import Carousel from '$lib/Carousel.svelte';
	import Menu from '$lib/Menu.svelte';
	import {categoriseEntries} from '$lib/utils.js'


	export let entries;
	$: categorisedEntries = categoriseEntries(entries)
</script>

<svelte:head>
	<title>dankbaarheid</title>
</svelte:head>

<main>
	<h1>My diaries</h1>

	<Carousel entries={categorisedEntries}/>
	<Menu entries={categorisedEntries}/>

</main>

<style>
	main {
		padding: 1em;
		margin: 0 auto;
	}

	h1 {
		font-size: 2rem;
		font-weight: 500;
		line-height: 1.1;
		margin: 0 0 10px;
	}

	p {
		max-width: 14rem;
		margin: 2rem auto;
		line-height: 1.35;
	}

	@media (min-width: 480px) {
		h1 {
			max-width: none;
		}

		p {
			max-width: none;
		}
	}
</style>
