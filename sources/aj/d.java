package aj;

import kh2.n3;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0014\u0010\u000b\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\n\u0010\bR\u0014\u0010\u000f\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u0010"}, d2 = {"Laj/d;", "", "", "a", "Ljava/lang/String;", "sequenceNumber", "", "b", "I", "priorRequestCount", "c", "priorRequestInSessionCount", "", "d", "J", "timeInSessionMilliseconds", "ads-mobile-sdk_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final /* data */ class d {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @om.b("seq_num")
    @NotNull
    public final String sequenceNumber;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @om.b("preqs")
    public final int priorRequestCount;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @om.b("preqs_in_session")
    public final int priorRequestInSessionCount;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @om.b("time_in_session")
    public final long timeInSessionMilliseconds;

    public d(String sequenceNumber, int i13, int i14, long j13) {
        Intrinsics.checkNotNullParameter(sequenceNumber, "sequenceNumber");
        this.sequenceNumber = sequenceNumber;
        this.priorRequestCount = i13;
        this.priorRequestInSessionCount = i14;
        this.timeInSessionMilliseconds = j13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return Intrinsics.d(this.sequenceNumber, dVar.sequenceNumber) && this.priorRequestCount == dVar.priorRequestCount && this.priorRequestInSessionCount == dVar.priorRequestInSessionCount && this.timeInSessionMilliseconds == dVar.timeInSessionMilliseconds;
    }

    public final int hashCode() {
        return Long.hashCode(this.timeInSessionMilliseconds) + n3.f(this.priorRequestInSessionCount, n3.f(this.priorRequestCount, this.sequenceNumber.hashCode() * 31));
    }

    public final String toString() {
        String str = this.sequenceNumber;
        int i13 = this.priorRequestCount;
        int i14 = this.priorRequestInSessionCount;
        long j13 = this.timeInSessionMilliseconds;
        StringBuilder v13 = a.a.v("AppStats(sequenceNumber=", str, ", priorRequestCount=", i13, ", priorRequestInSessionCount=");
        v13.append(i14);
        v13.append(", timeInSessionMilliseconds=");
        v13.append(j13);
        v13.append(")");
        return v13.toString();
    }
}
