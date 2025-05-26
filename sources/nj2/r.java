package nj2;

/* loaded from: classes4.dex */
public abstract class r {
    public final String toString() {
        StringBuilder sb3 = new StringBuilder("SpanData{spanContext=");
        b bVar = (b) this;
        i iVar = bVar.f90983a;
        sb3.append(iVar.f91002b);
        sb3.append(", parentSpanContext=");
        sb3.append(iVar.f91003c);
        sb3.append(", resource=");
        sb3.append(iVar.f91007g);
        sb3.append(", instrumentationScopeInfo=");
        sb3.append(iVar.f91008h);
        sb3.append(", name=");
        sb3.append(bVar.f90991i);
        sb3.append(", kind=");
        sb3.append(iVar.f91005e);
        sb3.append(", startEpochNanos=");
        sb3.append(iVar.f91009i);
        sb3.append(", endEpochNanos=");
        sb3.append(bVar.f90992j);
        sb3.append(", attributes=");
        sb3.append(bVar.f90986d);
        sb3.append(", totalAttributeCount=");
        sb3.append(bVar.f90987e);
        sb3.append(", events=");
        sb3.append(bVar.f90985c);
        sb3.append(", totalRecordedEvents=");
        sb3.append(bVar.f90988f);
        sb3.append(", links=");
        sb3.append(bVar.f90984b);
        sb3.append(", totalRecordedLinks=");
        sb3.append(bVar.f90989g);
        sb3.append(", status=");
        sb3.append(bVar.f90990h);
        sb3.append(", hasEnded=");
        return a.a.r(sb3, bVar.f90993k, "}");
    }
}
