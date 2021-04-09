<script context="module">
	export async function load({ page, fetch }) {
		const { slug } = page.params;
		const entry = await fetch(`http://localhost:8080/api/entries/${slug}`).then((r) => r.json())
		return {
			props: { entry, slug }
		};
	}
    
</script>

<script>
    export let slug;
    export let entry;
</script>

<h1>{slug}</h1>
<p>{JSON.stringify(entry)}</p>