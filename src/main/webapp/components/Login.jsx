var React = require('react');

class Login extends React.Component{
    constructor(props){
        super(props);
        this.state = {
            username: '',
            Password:''
        };
        this.handleChange = this.handleChange.bind(this);
        this.handleSubmit = this.handleSubmit.bind(this);
    }


    handleChange(event){
        this.setState({
            [event.target.name]: event.target.value
        });
    }

    handleSubmit(event) {
        var username = event.target.username.value;
        var Password = event.target.Password.value;
        console.log(username);
        console.log(Password);
        event.preventDefault();
    }

    render(){
        return(
            <div>
                <div class="translucent-form-overlay">
                    <form onSubmit={this.handleSubmit}>
                        <h3>Log In</h3>
                        <div class="row columns">
                            <label>Username
                                <input
                                    type="text"
                                    name="username"
                                    value={this.state.username}
                                    onChange={this.handleChange}
                                    placeholder="At least 4 characters"/>
                            </label>
                        </div>
                        <div class="row columns">
                            <label>Password
                                <input
                                    type="password"
                                    name="Password"
                                    value={this.state.Password}
                                    onChange={this.handleChange}
                                    placeholder="At least 4 characters"/>
                            </label>
                        </div>
                        <div>
                            <button
                                type="submit"
                                value = "Submit"
                                className="primary button button expanded search-button">
                                Log In
                            </button>
                        </div>
                    </form>
                </div>
            </div>
        )
    }
}

module.exports = Login;

