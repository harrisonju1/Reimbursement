var React = require('react');
var {Link, IndexLink} = require('react-router');



var Nav = React.createClass({
  render: function(){
      return(
        <div className="top-bar">
          <div className="top-bar-left">
            <ul className="menu">
              <li className="menu-text">
                  Big Booty Reimbursements
              </li>
              <li>
                <IndexLink to="/" activeClassName="active-link">Home</IndexLink>
              </li>
                <li>
                    <Link to="claimsubmit" activeClassName="active-link">Submit Claim</Link>
                </li>
              <li>
                <Link to="checkstatus" activeClassName="active-link">Check Status</Link>
              </li>
            </ul>
          </div>
          <div className = "top-bar-right">
            <ul className="menu">
                <li>
                    <Link to="login" activeClassName="active-link">Log Out</Link>
                </li>
            </ul>
          </div>
        </div>
      );
  }
});

module.exports= Nav;
