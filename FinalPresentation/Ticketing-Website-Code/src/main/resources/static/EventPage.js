js
document.querySelectorAll("#event-list > div.event-preview").forEach(element => {
    let id = element.getAttribute("eventid");
    element.onclick= element => {
        updatePreview(id);
    }
});

async function updatePreview(id){
    let event = json.parse(await fetch(`/api/events/${id}`))
    document.getElementbyId(#details-container img.bgimage).src=event.backGroundUrl;
    document.getElementbyId(#details-container div.card h1).innerText=event.eventName;
    //document.getElementbyId(#details-container div.card h3.location).innerText=event.eventLocation;
    document.getElementbyId(#details-container div.card h3.time).innerText=event.startTime;
    document.getElementbyId(#details-container div.card div.description).innerText=event.eventDetails;
    document.getElementbyId(#details-container div.card button.buy).innerText=`Buy for $${event.price}.00`;
}