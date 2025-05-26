package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes3.dex */
public final class r implements Iterator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f31613a;

    /* renamed from: b, reason: collision with root package name */
    public int f31614b = 0;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f31615c;

    public /* synthetic */ r(Object obj, int i13) {
        this.f31613a = i13;
        this.f31615c = obj;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i13 = this.f31613a;
        Object obj = this.f31615c;
        switch (i13) {
            case 0:
                if (this.f31614b < ((p) obj).f31578a.length()) {
                    break;
                }
                break;
            case 1:
                if (this.f31614b < ((p) obj).f31578a.length()) {
                    break;
                }
                break;
            default:
                if (this.f31614b < ((e) obj).i()) {
                    break;
                }
                break;
        }
        return true;
    }

    @Override // java.util.Iterator
    public final /* synthetic */ Object next() {
        int i13 = this.f31613a;
        Object obj = this.f31615c;
        switch (i13) {
            case 0:
                p pVar = (p) obj;
                if (this.f31614b >= pVar.f31578a.length()) {
                    throw new NoSuchElementException();
                }
                int i14 = this.f31614b;
                this.f31614b = i14 + 1;
                return new p(String.valueOf(pVar.f31578a.charAt(i14)));
            case 1:
                if (this.f31614b >= ((p) obj).f31578a.length()) {
                    throw new NoSuchElementException();
                }
                int i15 = this.f31614b;
                this.f31614b = i15 + 1;
                return new p(String.valueOf(i15));
            default:
                e eVar = (e) obj;
                if (this.f31614b >= eVar.i()) {
                    throw new NoSuchElementException(a.a.d("Out of bounds index: ", this.f31614b));
                }
                int i16 = this.f31614b;
                this.f31614b = i16 + 1;
                return eVar.e(i16);
        }
    }
}
