package uaemex.fi.isii.patterns.bridge;

import uaemex.fi.isii.patterns.factory.Transport;

public abstract class TransportBridge implements Transport {
    protected WorkAction pickup;
    protected WorkAction travel;
    protected WorkAction deliver;

    public TransportBridge(WorkAction pickup, WorkAction travel, WorkAction deliver) {
        this.pickup = pickup;
        this.travel = travel;
        this.deliver = deliver;
    }

}
