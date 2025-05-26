package lq0;

import com.pinterest.api.model.cf;
import com.pinterest.api.model.mv;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class v1 implements b1 {

    /* renamed from: a, reason: collision with root package name */
    public String f84446a;

    /* renamed from: b, reason: collision with root package name */
    public final cf f84447b;

    /* renamed from: c, reason: collision with root package name */
    public mv f84448c;

    /* renamed from: d, reason: collision with root package name */
    public final a1 f84449d;

    public v1(String str, cf cfVar, mv convoThreadAnchorMessage, a1 convoViewSource) {
        Intrinsics.checkNotNullParameter(convoThreadAnchorMessage, "convoThreadAnchorMessage");
        Intrinsics.checkNotNullParameter(convoViewSource, "convoViewSource");
        this.f84446a = str;
        this.f84447b = cfVar;
        this.f84448c = convoThreadAnchorMessage;
        this.f84449d = convoViewSource;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v1)) {
            return false;
        }
        v1 v1Var = (v1) obj;
        return Intrinsics.d(this.f84446a, v1Var.f84446a) && Intrinsics.d(this.f84447b, v1Var.f84447b) && Intrinsics.d(this.f84448c, v1Var.f84448c) && Intrinsics.d(this.f84449d, v1Var.f84449d);
    }

    public final int hashCode() {
        String str = this.f84446a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        cf cfVar = this.f84447b;
        return this.f84449d.hashCode() + ((this.f84448c.hashCode() + ((hashCode + (cfVar != null ? cfVar.hashCode() : 0)) * 31)) * 31);
    }

    public final String toString() {
        return "ThreadCloseupViewState(convoThreadId=" + this.f84446a + ", convoThread=" + this.f84447b + ", convoThreadAnchorMessage=" + this.f84448c + ", convoViewSource=" + this.f84449d + ")";
    }
}
