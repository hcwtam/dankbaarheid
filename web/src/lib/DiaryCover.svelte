<script>
    export let small = false;
</script>


    <a href="entries/2021-04-06">
        <div class='container'  class:small>
        </div>
    </a>



<style>
    .container {
        width: 200px;
        height: 250px;
        background-color: rgb(50, 161, 161);
        border-radius: 2px 20px 20px 2px;
        box-shadow: rgba(97, 68, 48, 0.7) 12px 20px 30px -10px, rgba(82, 63, 50, 0.7) 14px 24px 50px -10px, rgba(255, 255, 255, 0.6) inset 3px 0 6px;
        cursor: pointer;
        transition: 0.1s all ease-out;
    }

    .container.small {
        width: 100px;
        height: 125px;
        box-shadow: rgba(97, 68, 48, 0.4) 6px 10px 15px -5px, rgba(82, 63, 50, 0.4) 7px 12px 25px -5px, rgba(255, 255, 255, 0.6) inset 2px 0 6px;
    }

    .container:hover {
        transform: scale(1.01);
    }

    
</style>

