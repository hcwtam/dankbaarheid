<script>
	export let date;
</script>

<main>
	<div class='date'>{date}</div>
	<slot />
</main>

<style>
	main {
		position: relative;
		background-color: #fbfbfb;
		width: 98%;
		max-width: 600px;
		height: 700px;
		margin: 0 auto;
		padding: 20px;
		border-radius: 0 10px 10px 0;
        box-shadow: rgba(149, 157, 165, 0.2) 0px 8px 24px;
		color: #555;
	}

	main::after {
		content: '';
		display: block;
		position: absolute;
		width: 500px;
		height: 700px;
		left: -500px;
		top: 5px;
		background-color: #f3eee8;
		border-radius: 10px 0 0 10px;
		z-index: -1;
		transform: skewY(-1deg);
	}

	.date {
		padding: 15px 10px;
		border-bottom: 1px solid #eee;
		color: #886d34;
		font-weight: 500;
	}

</style>