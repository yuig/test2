package q5;

import android.content.ClipData;
import android.net.Uri;
import android.os.Bundle;
import android.view.ContentInfo;

/* loaded from: classes3.dex */
public final class e implements d, f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f102420a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final ClipData f102421b;

    /* renamed from: c, reason: collision with root package name */
    public final int f102422c;

    /* renamed from: d, reason: collision with root package name */
    public int f102423d;

    /* renamed from: e, reason: collision with root package name */
    public Uri f102424e;

    /* renamed from: f, reason: collision with root package name */
    public Bundle f102425f;

    public e(e eVar) {
        ClipData clipData = eVar.f102421b;
        clipData.getClass();
        this.f102421b = clipData;
        int i13 = eVar.f102422c;
        com.bumptech.glide.d.k("source", i13, 0, 5);
        this.f102422c = i13;
        int i14 = eVar.f102423d;
        if ((i14 & 1) == i14) {
            this.f102423d = i14;
            this.f102424e = eVar.f102424e;
            this.f102425f = eVar.f102425f;
        } else {
            throw new IllegalArgumentException("Requested flags 0x" + Integer.toHexString(i14) + ", but only 0x" + Integer.toHexString(1) + " are allowed");
        }
    }

    @Override // q5.f
    public final int D() {
        return this.f102423d;
    }

    @Override // q5.d
    public final void a(Bundle bundle) {
        this.f102425f = bundle;
    }

    @Override // q5.f
    public final int b() {
        return this.f102422c;
    }

    @Override // q5.d
    public final g build() {
        return new g(new e(this));
    }

    @Override // q5.f
    public final ContentInfo c() {
        return null;
    }

    @Override // q5.d
    public final void d(Uri uri) {
        this.f102424e = uri;
    }

    @Override // q5.d
    public final void e(int i13) {
        this.f102423d = i13;
    }

    @Override // q5.f
    public final ClipData t() {
        return this.f102421b;
    }

    public final String toString() {
        String str;
        switch (this.f102420a) {
            case 1:
                StringBuilder sb3 = new StringBuilder("ContentInfoCompat{clip=");
                sb3.append(this.f102421b.getDescription());
                sb3.append(", source=");
                int i13 = this.f102422c;
                sb3.append(i13 != 0 ? i13 != 1 ? i13 != 2 ? i13 != 3 ? i13 != 4 ? i13 != 5 ? String.valueOf(i13) : "SOURCE_PROCESS_TEXT" : "SOURCE_AUTOFILL" : "SOURCE_DRAG_AND_DROP" : "SOURCE_INPUT_METHOD" : "SOURCE_CLIPBOARD" : "SOURCE_APP");
                sb3.append(", flags=");
                int i14 = this.f102423d;
                sb3.append((i14 & 1) != 0 ? "FLAG_CONVERT_TO_PLAIN_TEXT" : String.valueOf(i14));
                if (this.f102424e == null) {
                    str = "";
                } else {
                    str = ", hasLinkUri(" + this.f102424e.toString().length() + ")";
                }
                sb3.append(str);
                return a.a.p(sb3, this.f102425f != null ? ", hasExtras" : "", "}");
            default:
                return super.toString();
        }
    }

    public e(ClipData clipData, int i13) {
        this.f102421b = clipData;
        this.f102422c = i13;
    }
}
