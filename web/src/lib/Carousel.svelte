<script>
 import DiaryCover from './DiaryCover.svelte'
</script>

<main>
    <div>
        <DiaryCover />
    </div>
    <div>
        <DiaryCover />
    </div>
    <div>
        <DiaryCover />
    </div>
</main>

<style>
    main {
        height: 300px;
        margin: 30px 0;
        display: flex;
        justify-content: center;
        align-items: center;
    }
    div {
        margin: 0 50px;
    }
</style>
