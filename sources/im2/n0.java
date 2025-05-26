package im2;

import a.cb;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class n0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f72754a;

    /* renamed from: b, reason: collision with root package name */
    public final ym2.g f72755b;

    /* renamed from: c, reason: collision with root package name */
    public final String f72756c;

    /* renamed from: d, reason: collision with root package name */
    public final String f72757d;

    /* renamed from: e, reason: collision with root package name */
    public final String f72758e;

    public n0(String internalName, ym2.g name, String parameters, String returnType) {
        Intrinsics.checkNotNullParameter(internalName, "classInternalName");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(parameters, "parameters");
        Intrinsics.checkNotNullParameter(returnType, "returnType");
        this.f72754a = internalName;
        this.f72755b = name;
        this.f72756c = parameters;
        this.f72757d = returnType;
        String jvmDescriptor = name + '(' + parameters + ')' + returnType;
        Intrinsics.checkNotNullParameter(internalName, "internalName");
        Intrinsics.checkNotNullParameter(jvmDescriptor, "jvmDescriptor");
        this.f72758e = internalName + '.' + jvmDescriptor;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n0)) {
            return false;
        }
        n0 n0Var = (n0) obj;
        return Intrinsics.d(this.f72754a, n0Var.f72754a) && Intrinsics.d(this.f72755b, n0Var.f72755b) && Intrinsics.d(this.f72756c, n0Var.f72756c) && Intrinsics.d(this.f72757d, n0Var.f72757d);
    }

    public final int hashCode() {
        return this.f72757d.hashCode() + cb.d(this.f72756c, (this.f72755b.hashCode() + (this.f72754a.hashCode() * 31)) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("NameAndSignature(classInternalName=");
        sb3.append(this.f72754a);
        sb3.append(", name=");
        sb3.append(this.f72755b);
        sb3.append(", parameters=");
        sb3.append(this.f72756c);
        sb3.append(", returnType=");
        return ep.b.k(sb3, this.f72757d, ')');
    }
}
