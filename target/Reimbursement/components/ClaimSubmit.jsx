var React = require('react');

class ClaimSubmit extends React.Component{
    constructor(props){
        super(props);
        this.state={
            costs:'',
            description:'',
            attachment:'',
            typeofr:'',
            eventstart: '',
            eventend: '',
            misstime:'',
            location:''
        };
        this.handleChange=this.handleChange.bind(this);
        this.handleSubmit=this.handleSubmit.bind(this);
    }

    handleChange(event){
        this.setState({
            [event.target.name]: event.target.value
        });
    }

    handleSubmit(event){
        alert('we got here');
        event.preventDefault();
    }

    render(){
        return(
            <div>
                <div class="translucent-form-overlay">
                    <form onSubmit={this.handleSubmit}>
                        <h3>Submit Claim</h3>
                        <div class="row columns">
                            <form onSubmit={this.handleSubmit} action="/action_page.php">
                                <div>
                                    <select name="typeofr" value={this.state.value} onChange={this.handleChange}>
                                        <option value="university">University Courses</option>
                                        <option value="seminar">Seminar</option>
                                        <option value="prep">Certification Classes</option>
                                        <option value="training">Technical training</option>
                                        <option value="other">Other</option>
                                    </select>
                                </div>
                                <div>
                                    <label>
                                        <input
                                            type="text"
                                            name="description"
                                            value={this.state.description}
                                            onChange={this.handleChange}
                                            placeholder="Describe if other"
                                        />
                                    </label>
                                </div>
                                <div>
                                    <label>Reimbursement Costs
                                        <input
                                            type="number"
                                            name="costs"
                                            value={this.state.costs}
                                            onChange={this.handleChange}
                                            placeholder="Number value only"/>
                                    </label>
                                </div>
                                <div>
                                    <label>Location
                                        <input
                                            type="text"
                                            name="location"
                                            value={this.state.costs}
                                            onChange={this.handleChange}
                                            placeholder="If applicable"/>
                                    </label>
                                </div>

                                <div>
                                    <label>
                                        Event Start Date
                                        <input
                                            type="datetime-local"
                                            name="eventstart"
                                            value={this.state.eventstart}
                                            onchange={this.handleChange}
                                            />
                                    </label>
                                </div>
                                <div>
                                    <label>
                                        Event End Date
                                        <input
                                            type="datetime-local"
                                            name="eventend"
                                            value={this.state.eventend}
                                            onchange={this.handleChange}
                                        />
                                    </label>
                                </div>
                                <div>
                                    <label>
                                        Expected Time to Miss
                                        <input
                                            type="number"
                                            name="misstime"
                                            value={this.state.misstime}
                                            onChange={this.handleChange}
                                            placeholder="Number value only"/>
                                    </label>
                                </div>
                                <div>
                                    <label>Attachments
                                        <input
                                            type="file"
                                            name="attachment"
                                            value={this.state.attachment}
                                            onChange={this.handleChange}/>
                                        <input type="submit"/>
                                    </label>
                                </div>
                            </form>
                        </div>
                    </form>
                </div>
            </div>
        )
    }
}

module.exports = ClaimSubmit;
