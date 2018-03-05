var React = require('react');
var ReactDOM = require('react-dom');
var {Route, Router, IndexRoute, hashHistory} = require('react-router');
var Main = require('Main');
var Login = require('Login');
var ClaimSubmit = require('ClaimSubmit');
var CheckStatus = require('CheckStatus');


//Load foundations
require('style!css!foundation-sites/dist/foundation.min.css')
$(document).foundation;

//load app.css
require('style!css!sass!applicationStyles')


ReactDOM.render(
  <Router history={hashHistory}>
    <Route path="/" component={Main}>
        <Route path="claimsubmit" component = {ClaimSubmit}/>
        <Route path="home" component ={Login}/>
        <Route path="checkstatus" component={CheckStatus}/>
        <IndexRoute component={Login}/>
    </Route>
  </Router>,
  document.getElementById('app')

);
