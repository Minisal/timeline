// https://docs.cypress.io/api/introduction/api.html

describe('Test the ui panel', () => {
  it('Visits the app root url', () => {
    cy.visit('/')
    cy.contains('timeline-title', 'Timeline')
  })
  it('Visits the new button', () => {
    cy.visit('/')
    cy.contains('button', 'NEW')
  })
  it('Visits the more button', () => {
    cy.visit('/')
    cy.contains('button', 'MORE')
  })
  it('Visits the message user', () => {
    cy.visit('/')
    cy.contains('h3', '天猫')
  })
})
