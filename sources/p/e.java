package p;

import java.util.Iterator;

/* loaded from: classes.dex */
public abstract class e extends f implements Iterator {

    /* renamed from: a, reason: collision with root package name */
    public c f98289a;

    /* renamed from: b, reason: collision with root package name */
    public c f98290b;

    @Override // p.f
    public final void a(c cVar) {
        c cVar2;
        c cVar3;
        c cVar4 = null;
        if (this.f98289a == cVar && cVar == this.f98290b) {
            this.f98290b = null;
            this.f98289a = null;
        }
        c cVar5 = this.f98289a;
        if (cVar5 == cVar) {
            switch (((b) this).f98281c) {
                case 0:
                    cVar3 = cVar5.f98285d;
                    break;
                default:
                    cVar3 = cVar5.f98284c;
                    break;
            }
            this.f98289a = cVar3;
        }
        c cVar6 = this.f98290b;
        if (cVar6 == cVar) {
            c cVar7 = this.f98289a;
            if (cVar6 != cVar7 && cVar7 != null) {
                switch (((b) this).f98281c) {
                    case 0:
                        cVar2 = cVar6.f98284c;
                        break;
                    default:
                        cVar2 = cVar6.f98285d;
                        break;
                }
                cVar4 = cVar2;
            }
            this.f98290b = cVar4;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f98290b != null;
    }

    @Override // java.util.Iterator
    public final Object next() {
        c cVar;
        c cVar2 = this.f98290b;
        c cVar3 = this.f98289a;
        if (cVar2 != cVar3 && cVar3 != null) {
            switch (((b) this).f98281c) {
                case 0:
                    cVar = cVar2.f98284c;
                    break;
                default:
                    cVar = cVar2.f98285d;
                    break;
            }
        } else {
            cVar = null;
        }
        this.f98290b = cVar;
        return cVar2;
    }
}
