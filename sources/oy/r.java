package oy;

import ey.a3;

/* loaded from: classes.dex */
public abstract class r extends ey.u1 {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f98174c;

    /* renamed from: d, reason: collision with root package name */
    public final String f98175d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f98176e;

    public r(int i13) {
        this.f98174c = i13;
        if (i13 == 1) {
            this.f98175d = u.f98204a;
            this.f98176e = "process_media";
        } else if (i13 != 2) {
            this.f98175d = d0.f98027a;
            this.f98176e = "generate_bitmap";
        } else {
            this.f98175d = "media_upload_status";
            this.f98176e = w1.f98229a;
        }
    }

    @Override // ey.u1
    public final String e() {
        Object obj = this.f98176e;
        switch (this.f98174c) {
            case 0:
                return (String) obj;
            case 1:
                return (String) obj;
            default:
                return this.f98175d;
        }
    }

    @Override // ey.u1
    public final String g() {
        Object obj = this.f98176e;
        int i13 = this.f98174c;
        String str = this.f98175d;
        switch (i13) {
            case 0:
            case 1:
                return str;
            case 2:
                return (String) obj;
            default:
                return a3.a((s92.i) obj);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r(int i13, int i14) {
        this(0);
        this.f98174c = i13;
        if (i13 == 1) {
            this(1);
        } else if (i13 != 2) {
        } else {
            this(2);
        }
    }
}
