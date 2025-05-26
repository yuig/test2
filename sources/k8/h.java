package k8;

import pk.j0;

/* loaded from: classes3.dex */
public final class h implements Comparable {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f78528a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f78529b;

    public h(int i13, androidx.media3.common.b bVar) {
        this.f78528a = (bVar.f18755e & 1) != 0;
        this.f78529b = m7.h.p(i13, false);
    }

    @Override // java.lang.Comparable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final int compareTo(h hVar) {
        return j0.f100432a.c(this.f78529b, hVar.f78529b).c(this.f78528a, hVar.f78528a).e();
    }
}
