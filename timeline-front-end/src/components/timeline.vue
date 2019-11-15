
<template id="time-line">
  <div>
  <timeline class="timeline">
    <timeline-title class="timeline-title">Timeline</timeline-title>
    <button class="blue-button" style="margin-left:70px;" v-on:click="getNew"><span>5 NEW</span></button>
    <timeline-item class='timeline-item' v-for="message in messages" v-bind:key="message.id">
      <h3>{{message.user}}</h3>
      <p>{{message.content}}</p>
      <a>{{message.addTime}}</a>
    </timeline-item>
  </timeline>
  <div class = "buttonBg">
    <button class="blue-button" v-on:click="getOld"><span>MORE</span></button>
  </div>
  </div>
</template>

<script>
import { Timeline, TimelineItem, TimelineTitle } from 'vue-cute-timeline'
import axios from 'axios'
export default {
  name: 'timelines',
  template: '#time-line',
  props: {
    messages: Array
  },
  components: {
    Timeline,
    TimelineItem,
    TimelineTitle
  },
  methods: {
    getNew: function (event) {
      var that = this
      axios
        .get('http://localhost:8080/message/getNew', {
          params: {
            messageId: that.messages[0].id
          }
        })
        .then(function (res) {
          for (let i = 0; i < res.data.length - 1; i++) {
            that.messages.unshift(res.data[i])
          }
          console.log(that.messages)
        }).catch(function (error) {
          console.log(error)
        })
    },
    getOld: function (event) {
      var that = this
      axios
        .get('http://localhost:8080/message/getOld', {
          params: {
            messageId: that.messages[that.messages.length - 1].id
          }
        })
        .then(function (res) {
          for (let i = res.data.length - 1; i >= 0; i--) {
            that.messages.push(res.data[i])
          }
          console.log(that.messages)
        }).catch(function (error) {
          console.log(error)
        })
    }
  }
}
</script>
<style>
.timeline {
  text-align: left;
  color: #2c3e50;
  margin-top: 20px;
  }
.timeline-item{
  text-align: left;
  bg-color: "#9dd8e0";
}
.timeline-title{
  font-size: 37px;
}
.blue-button {
  background-color: #9dd8e0;
  color: white;
  height:27px;
  width:100px;
  text-align: center;
  border-radius: 2px;
  border: 2px solid #9dd8e0;
  text-decoration: none;
  display: inline-block;
  font-size: 17px;
  transition: all 0.5s;
  cursor: pointer;
  outline:none;
}

.blue-button span {
  cursor: pointer;
  display: inline-block;
  position: relative;
  transition: 0.5s;
}

.blue-button span:after {
  content: '»';
  position: absolute;
  opacity: 0;
  top: 0;
  right: -10px;
  transition: 0.5s;
}

.blue-button:hover span {
  padding-right: 25px;
}

.blue-button:hover span:after {
  opacity: 1;
  right: 0;
}

.buttonBg {
  height:150px;
  justify-content:center;
  display:flex;
  align-items: center;
}
</style>
