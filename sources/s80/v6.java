package s80;

import com.pinterest.api.model.go;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class v6 implements u50.o {

    /* renamed from: a, reason: collision with root package name */
    public final String f111831a;

    /* renamed from: b, reason: collision with root package name */
    public final go f111832b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f111833c;

    public v6(String color, go brushType, boolean z13) {
        Intrinsics.checkNotNullParameter(color, "color");
        Intrinsics.checkNotNullParameter(brushType, "brushType");
        this.f111831a = color;
        this.f111832b = brushType;
        this.f111833c = z13;
    }

    public static v6 e(v6 v6Var, String color, go brushType, boolean z13, int i13) {
        if ((i13 & 1) != 0) {
            color = v6Var.f111831a;
        }
        if ((i13 & 2) != 0) {
            brushType = v6Var.f111832b;
        }
        if ((i13 & 4) != 0) {
            z13 = v6Var.f111833c;
        }
        v6Var.getClass();
        Intrinsics.checkNotNullParameter(color, "color");
        Intrinsics.checkNotNullParameter(brushType, "brushType");
        return new v6(color, brushType, z13);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v6)) {
            return false;
        }
        v6 v6Var = (v6) obj;
        return Intrinsics.d(this.f111831a, v6Var.f111831a) && this.f111832b == v6Var.f111832b && this.f111833c == v6Var.f111833c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f111833c) + ((this.f111832b.hashCode() + (this.f111831a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("DrawingToolState(color=");
        sb3.append(this.f111831a);
        sb3.append(", brushType=");
        sb3.append(this.f111832b);
        sb3.append(", visible=");
        return a.a.r(sb3, this.f111833c, ")");
    }
}
