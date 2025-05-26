package s31;

import com.pinterest.api.model.kg0;
import dl1.s;
import ep.b;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import ol2.f;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes5.dex */
public final class a implements s {

    /* renamed from: a, reason: collision with root package name */
    public final int f111055a;

    /* renamed from: b, reason: collision with root package name */
    public final List f111056b;

    /* renamed from: c, reason: collision with root package name */
    public final String f111057c;

    public a(int i13, @NotNull List<? extends kg0> previewScheduledPins, @NotNull String uuid) {
        Intrinsics.checkNotNullParameter(previewScheduledPins, "previewScheduledPins");
        Intrinsics.checkNotNullParameter(uuid, "uuid");
        this.f111055a = i13;
        this.f111056b = previewScheduledPins;
        this.f111057c = uuid;
    }

    @Override // dl1.s
    /* renamed from: b */
    public final String getId() {
        return this.f111057c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f111055a == aVar.f111055a && Intrinsics.d(this.f111056b, aVar.f111056b) && Intrinsics.d(this.f111057c, aVar.f111057c);
    }

    public final int hashCode() {
        return this.f111057c.hashCode() + b.c(this.f111056b, Integer.hashCode(this.f111055a) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("ScheduledPinsPreviewModel(scheduledPinCount=");
        sb3.append(this.f111055a);
        sb3.append(", previewScheduledPins=");
        sb3.append(this.f111056b);
        sb3.append(", uuid=");
        return a.a.p(sb3, this.f111057c, ")");
    }

    public /* synthetic */ a(int i13, List list, String str, int i14, DefaultConstructorMarker defaultConstructorMarker) {
        this(i13, list, (i14 & 4) != 0 ? f.f96454a.toString() : str);
    }
}
