package x32;

import c50.k6;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class b {

    /* renamed from: e */
    public static final k6 f131651e = new k6(0);

    /* renamed from: a */
    public final e f131652a;

    /* renamed from: b */
    public final String f131653b;

    /* renamed from: c */
    public final Boolean f131654c;

    /* renamed from: d */
    public final Short f131655d;

    public b(e eVar, String str, Boolean bool, Short sh3) {
        this.f131652a = eVar;
        this.f131653b = str;
        this.f131654c = bool;
        this.f131655d = sh3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f131652a == bVar.f131652a && Intrinsics.d(this.f131653b, bVar.f131653b) && Intrinsics.d(this.f131654c, bVar.f131654c) && Intrinsics.d(null, null) && Intrinsics.d(this.f131655d, bVar.f131655d);
    }

    public final int hashCode() {
        e eVar = this.f131652a;
        int hashCode = (eVar == null ? 0 : eVar.hashCode()) * 31;
        String str = this.f131653b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool = this.f131654c;
        int hashCode3 = (hashCode2 + (bool == null ? 0 : bool.hashCode())) * 961;
        Short sh3 = this.f131655d;
        return hashCode3 + (sh3 != null ? sh3.hashCode() : 0);
    }

    public final String toString() {
        return "HandshakeEventData(shoppingPinDecorationType=" + this.f131652a + ", decorationText=" + this.f131653b + ", accountLinked=" + this.f131654c + ", shoppingPinDecorationTypes=null, shoppingIntegrationType=" + this.f131655d + ")";
    }
}
