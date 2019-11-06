<template>
  <div id="div-timeline">
  <timeline>
    <timeline-title><h1>Timeline</h1></timeline-title>
     <button>new</button>
    <timeline-item bg-color="#9dd8e0" v-for="message in messages">
      <h2>{{message.user}}</h2>
      {{message.content}}
      <p>{{message.addTime}}</p>
    </timeline-item>

  </timeline>
    <button>more</button>
  </div>
</template>

<script>
  import { Timeline, TimelineItem, TimelineTitle } from 'vue-cute-timeline'
  import axios from 'axios';

  export default {
    components: {
      Timeline,
      TimelineItem,
      TimelineTitle
    },
    data() {
      return {
        messages: [
          {
            user:"user",
            content:"content",
            addTime:"2019-10-20 00:00:00"
          },{
            user:"user",
            content:"content",
            addTime:"2019-10-20 00:00:00"
          },
          {
            user:"user",
            content:"content",
            addTime:"2019-10-20 00:00:00"
          },
          {
            user:"user",
            content:"content",
            addTime:"2019-10-20 00:00:00"
          }
        ],
        info : null
      }
    },
    mounted() {
      axios.get('http://localhost:8080/message/getNew')
              .then(response => (console.log(response)))
              .catch(function(error){
                console.log(error);
              })
    }
  }

</script>


<style>
#div-timeline{
  width: 400px;
  height: 500px;
}

</style>
