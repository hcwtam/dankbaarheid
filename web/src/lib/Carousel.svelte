<script>
 import DiaryCover from './DiaryCover.svelte'
 export let entries;
</script>

<main>
    {#each Object.entries(entries) as [date, monthEntries]}
    <div>
        <DiaryCover {date} {monthEntries}/>
    </div>
    {/each}
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
