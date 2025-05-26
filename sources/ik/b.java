package ik;

import a.cb;
import java.io.File;

/* loaded from: classes3.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final File f72388a;

    /* renamed from: b, reason: collision with root package name */
    public final String f72389b;

    public b(File file, String str) {
        this.f72388a = file;
        if (str == null) {
            throw new NullPointerException("Null splitId");
        }
        this.f72389b = str;
    }

    public final File a() {
        return this.f72388a;
    }

    public final String b() {
        return this.f72389b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof b) {
            b bVar = (b) obj;
            if (this.f72388a.equals(bVar.f72388a) && this.f72389b.equals(bVar.f72389b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f72388a.hashCode() ^ 1000003) * 1000003) ^ this.f72389b.hashCode();
    }

    public final String toString() {
        return a.a.p(cb.o("SplitFileInfo{splitFile=", this.f72388a.toString(), ", splitId="), this.f72389b, "}");
    }
}
