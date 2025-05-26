package ij1;

import a.cb;
import kotlin.jvm.internal.Intrinsics;
import rl1.r;

/* loaded from: classes2.dex */
public final class a implements u50.o {

    /* renamed from: a, reason: collision with root package name */
    public final int f72341a;

    /* renamed from: b, reason: collision with root package name */
    public final String f72342b;

    /* renamed from: c, reason: collision with root package name */
    public final d f72343c;

    /* renamed from: d, reason: collision with root package name */
    public final r f72344d;

    public a(int i13, String name, d avatarToDisplay, r size) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(avatarToDisplay, "avatarToDisplay");
        Intrinsics.checkNotNullParameter(size, "size");
        this.f72341a = i13;
        this.f72342b = name;
        this.f72343c = avatarToDisplay;
        this.f72344d = size;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f72341a == aVar.f72341a && Intrinsics.d(this.f72342b, aVar.f72342b) && Intrinsics.d(this.f72343c, aVar.f72343c) && this.f72344d == aVar.f72344d;
    }

    public final int hashCode() {
        return this.f72344d.hashCode() + ((this.f72343c.hashCode() + cb.d(this.f72342b, Integer.hashCode(this.f72341a) * 31, 31)) * 31);
    }

    public final String toString() {
        return "AvatarDS(userColorIndex=" + this.f72341a + ", name=" + this.f72342b + ", avatarToDisplay=" + this.f72343c + ", size=" + this.f72344d + ")";
    }

    public /* synthetic */ a() {
        this(0, "", b.f72345a, r.MD);
    }
}
