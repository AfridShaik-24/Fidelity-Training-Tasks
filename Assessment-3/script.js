document.getElementById('serviceform').addEventListener('submit',function(event){
    event.preventDefault();
    const type=document.getElementById('serviceType').value;
    const yearlyMain=document.getElementById('YearlyMaintainance').value;
    const name=document.getElementById('customerName').value;
    const email=document.getAnimations('email').value;
    const actype=document.getElementById('acType').value;
    let charge;
    switch(type){
        case 'Cleaning':
            charge=500;
            break;
            case 'Repair':
                charge=1000;
                break;
                case 'Gas filling':
                    charge=1500;
                    break;
                    default:
                        charge=0;

    }
    if(yearlyMain){
        charge+=1000;
    }
const msg=yearlyMain? 'with yearly maintainance':'without yearly maintainance';
const res=`Hello ${name}, your service appointment for ${actype} AC ${type} ${msg} will be sent to your email Id ${email} and the estimated service charge will be RS ${charge}.`;
document.getElementById('messege').innerText=res;
})