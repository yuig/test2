package u52;

import a.cb;
import com.pinterest.api.model.ta;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class e1 implements f1 {

    /* renamed from: a, reason: collision with root package name */
    public final List f120683a;

    /* renamed from: b, reason: collision with root package name */
    public final ta f120684b;

    /* renamed from: c, reason: collision with root package name */
    public final String f120685c;

    /* renamed from: d, reason: collision with root package name */
    public final String f120686d;

    public e1(List templates, String boardName, String userName) {
        Intrinsics.checkNotNullParameter(templates, "templates");
        Intrinsics.checkNotNullParameter(boardName, "boardName");
        Intrinsics.checkNotNullParameter(userName, "userName");
        this.f120683a = templates;
        this.f120684b = null;
        this.f120685c = boardName;
        this.f120686d = userName;
    }

    public final String e() {
        return this.f120685c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e1)) {
            return false;
        }
        e1 e1Var = (e1) obj;
        return Intrinsics.d(this.f120683a, e1Var.f120683a) && Intrinsics.d(this.f120684b, e1Var.f120684b) && Intrinsics.d(this.f120685c, e1Var.f120685c) && Intrinsics.d(this.f120686d, e1Var.f120686d);
    }

    public final List f() {
        return this.f120683a;
    }

    public final String g() {
        return this.f120686d;
    }

    public final int hashCode() {
        int hashCode = this.f120683a.hashCode() * 31;
        ta taVar = this.f120684b;
        return this.f120686d.hashCode() + cb.d(this.f120685c, (hashCode + (taVar == null ? 0 : taVar.hashCode())) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("Loaded(templates=");
        sb3.append(this.f120683a);
        sb3.append(", selectedTemplate=");
        sb3.append(this.f120684b);
        sb3.append(", boardName=");
        sb3.append(this.f120685c);
        sb3.append(", userName=");
        return a.a.p(sb3, this.f120686d, ")");
    }
}
