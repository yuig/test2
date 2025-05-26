package uq0;

import dl1.m;

/* loaded from: classes.dex */
public abstract class a extends m {

    /* renamed from: c, reason: collision with root package name */
    public final int f123037c;

    /* renamed from: d, reason: collision with root package name */
    public final String f123038d;

    public a(int i13, String str) {
        this.f123037c = i13;
        this.f123038d = str;
    }

    public final boolean a() {
        return this.f123037c == 1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        a aVar = (a) obj;
        if (this.f123037c != aVar.f123037c) {
            return false;
        }
        String str = aVar.f123038d;
        String str2 = this.f123038d;
        return str2 != null ? str2.equals(str) : str == null;
    }

    public final int hashCode() {
        int i13 = this.f123037c * 31;
        String str = this.f123038d;
        return i13 + (str != null ? str.hashCode() : 0);
    }
}
