package a61;

import android.content.res.Resources;
import j42.d;
import kotlin.jvm.internal.Intrinsics;
import m60.g0;
import u81.r;

/* loaded from: classes5.dex */
public final class b implements g0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f906a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f907b;

    public b(int i13, Resources resources) {
        this.f906a = i13;
        if (i13 != 1) {
            Intrinsics.checkNotNullParameter(resources, "resources");
            this.f907b = resources;
        } else {
            Intrinsics.checkNotNullParameter(resources, "resources");
            this.f907b = resources;
        }
    }

    @Override // m60.g0
    public final int a() {
        int i13 = this.f906a;
        Object obj = this.f907b;
        switch (i13) {
            case 0:
                return ((Resources) obj).getInteger(d.search_landing_first_request_page_size);
            case 1:
                return ((Resources) obj).getInteger(d.search_landing_first_request_page_size);
            default:
                return Integer.parseInt(((r) obj).n9().e());
        }
    }

    @Override // m60.g0
    public final String b() {
        int i13 = this.f906a;
        Object obj = this.f907b;
        switch (i13) {
            case 0:
                return String.valueOf(((Resources) obj).getInteger(d.search_landing_subsequent_request_page_size));
            case 1:
                return String.valueOf(((Resources) obj).getInteger(d.search_landing_subsequent_request_page_size));
            default:
                return ((r) obj).n9().b();
        }
    }

    @Override // m60.g0
    public final String c() {
        int i13 = this.f906a;
        Object obj = this.f907b;
        switch (i13) {
            case 0:
                return String.valueOf(((Resources) obj).getInteger(d.search_landing_subsequent_request_page_size));
            case 1:
                return String.valueOf(((Resources) obj).getInteger(d.search_landing_second_request_page_size));
            default:
                return ((r) obj).n9().c();
        }
    }

    @Override // m60.g0
    public final String d() {
        int i13 = this.f906a;
        Object obj = this.f907b;
        switch (i13) {
            case 0:
                return String.valueOf(((Resources) obj).getInteger(d.search_landing_first_request_page_size));
            case 1:
                return String.valueOf(((Resources) obj).getInteger(d.search_landing_first_request_page_size));
            default:
                return ((r) obj).n9().e();
        }
    }

    @Override // m60.g0
    public final String e() {
        int i13 = this.f906a;
        Object obj = this.f907b;
        switch (i13) {
            case 0:
                return String.valueOf(((Resources) obj).getInteger(d.search_landing_second_request_page_size));
            case 1:
                return String.valueOf(((Resources) obj).getInteger(d.search_landing_second_request_page_size));
            default:
                return ((r) obj).n9().c();
        }
    }

    public b(r rVar) {
        this.f906a = 2;
        this.f907b = rVar;
    }
}
