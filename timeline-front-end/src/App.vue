<template>
  <div id="app">
    <div class="background">
    <timelines id="timeline" v-bind:messages="messages"/>
    </div>
  </div>
</template>

<script>
import timelines from './components/TimeLine'
import axios from 'axios'

export default {
  name: 'app',
  components: {
    timelines
  },
  data: function () {
    return {
      messages: null
    }
  },
  created () {
    var that = this
    axios
      .get('http://localhost:8080/message/getNow')
      .then(function (res) {
        console.log(res.data)
        that.messages = res.data.reverse()
      }).catch(function (error) {
        console.log(error)
      })
  }
}
</script>

<style>
#app {
  margin-top: 60px;
}
  .background{
    width: 400px;
    height: 600px;
    margin:0 auto;
    border-style: solid;
    border-width: 2px;
    border-color: #9dd8e0;
    overflow:scroll;
  }

</style>
