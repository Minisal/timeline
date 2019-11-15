import { expect } from 'chai'
import timelines from '@/components/TimeLine'
import Vue from 'vue'

describe('TimeLine.vue', () => {
  it('test the button text is NEW', () => {
    // build component
    const Constructor = Vue.extend(timelines)
    const TimelineComponent = new Constructor().$mount()
    // assert that component text contains items from the timelines
    expect(TimelineComponent.$el.querySelector('button').textContent).to.contain('NEW')
  })
})
