<script lang="ts">
	import Counter from '$lib/Counter.svelte';
</script>

<main>
	<h1>My diaries</h1>

	<Counter />

	<p>Visit <a href="https://svelte.dev">svelte.dev</a> to learn how to build Svelte apps.</p>
</main>

<style>
	main {
		padding: 1em;
		max-width: 600px;
		margin: 0 auto;
	}

	h1 {
		font-size: 2.5rem;
		font-weight: 600;
		line-height: 1.1;
		margin: 4rem auto;
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
