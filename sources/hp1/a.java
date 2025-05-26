package hp1;

import a.c;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class a {
    public a() {
        Intrinsics.checkNotNullParameter("modiface", "moduleName");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        ((a) obj).getClass();
        if (!Intrinsics.d("modiface", "modiface") || !Intrinsics.d("MFEMakeupKit", "MFEMakeupKit")) {
            return false;
        }
        Boolean bool = Boolean.TRUE;
        return Intrinsics.d(bool, bool);
    }

    public final int hashCode() {
        return Boolean.TRUE.hashCode() + (((-1901286404) - 1562146655) * 31);
    }

    public final String toString() {
        return c.h(new StringBuilder("OnDemandModuleRequest(moduleName=modiface, nativeLibName=MFEMakeupKit, showVTOToast="), Boolean.TRUE, ")");
    }
}
