package oy;

/* loaded from: classes.dex */
public abstract class a0 extends ey.u1 {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f97987c;

    /* renamed from: d, reason: collision with root package name */
    public final String f97988d;

    /* renamed from: e, reason: collision with root package name */
    public final String f97989e;

    /* renamed from: f, reason: collision with root package name */
    public final String f97990f;

    public a0(String str, int i13) {
        this.f97987c = i13;
        if (i13 == 1) {
            this.f97988d = "image_page_publish";
            this.f97989e = w1.f98229a;
            this.f97990f = str;
            return;
        }
        if (i13 == 2) {
            this.f97988d = d0.f98027a;
            this.f97989e = "image_to_video_conversion";
            this.f97990f = str;
        } else if (i13 == 3) {
            this.f97988d = "story_pin_create";
            this.f97989e = w1.f98229a;
            this.f97990f = str;
        } else if (i13 != 4) {
            this.f97988d = u.f98204a;
            this.f97989e = "thumbnail_load";
            this.f97990f = str;
        } else {
            this.f97988d = "video_page_publish";
            this.f97989e = w1.f98229a;
            this.f97990f = str;
        }
    }

    @Override // ey.u1
    public final String b() {
        return this.f97990f;
    }

    @Override // ey.u1
    public final String e() {
        int i13 = this.f97987c;
        String str = this.f97989e;
        switch (i13) {
            case 0:
            case 2:
                return str;
            case 1:
            default:
                return this.f97988d;
        }
    }

    @Override // ey.u1
    public final String g() {
        int i13 = this.f97987c;
        String str = this.f97988d;
        switch (i13) {
            case 0:
            case 2:
                return str;
            case 1:
            default:
                return this.f97989e;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a0(String str, int i13, int i14) {
        this(str, 0);
        this.f97987c = i13;
        if (i13 == 1) {
            this(str, 1);
            return;
        }
        if (i13 == 2) {
            this(str, 2);
            return;
        }
        if (i13 == 3) {
            this(str, 3);
        } else if (i13 != 4) {
        } else {
            this(str, 4);
        }
    }
}
