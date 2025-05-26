package com.bumptech.glide;

/* loaded from: classes.dex */
public abstract class p implements Cloneable {

    /* renamed from: a, reason: collision with root package name */
    public final fe.e f29840a = fe.b.f62035b;

    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final p clone() {
        try {
            return (p) super.clone();
        } catch (CloneNotSupportedException e13) {
            throw new RuntimeException(e13);
        }
    }

    public boolean equals(Object obj) {
        if (obj instanceof p) {
            return he.n.b(this.f29840a, ((p) obj).f29840a);
        }
        return false;
    }

    public int hashCode() {
        fe.e eVar = this.f29840a;
        if (eVar != null) {
            return eVar.hashCode();
        }
        return 0;
    }
}
