package com.pinterest.api.model;

import androidx.annotation.NonNull;
import java.util.Objects;

/* loaded from: classes.dex */
public class k {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    @om.b("id")
    private String f39190a;

    /* renamed from: b, reason: collision with root package name */
    @om.b("node_id")
    private String f39191b;

    /* renamed from: c, reason: collision with root package name */
    @om.b("closeup_type")
    private a f39192c;

    /* renamed from: d, reason: collision with root package name */
    @om.b("creative_type")
    private b f39193d;

    /* renamed from: e, reason: collision with root package name */
    @om.b("destination_type")
    private c f39194e;

    /* renamed from: f, reason: collision with root package name */
    @om.b("media_type")
    private d f39195f;

    /* renamed from: g, reason: collision with root package name */
    @om.b("pin_promotion_id")
    private String f39196g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean[] f39197h;

    public enum a {
        STANDARD(0),
        COLLECTIONS(1),
        CAROUSEL(2),
        IDEA(3),
        LEAD(4),
        QUIZ(5),
        PRODUCTDETAILPAGE(6),
        SHOWCASE(7),
        CARTING(8);

        private final int value;

        a(int i13) {
            this.value = i13;
        }

        public int getValue() {
            return this.value;
        }
    }

    public enum b {
        REGULAR(0),
        APP(1),
        CINEMATIC(2),
        COMMERCE(3),
        BOARD(4),
        VIDEO(5),
        NATIVEVIDEO(6),
        SHOPPING(7),
        SEARCHPROMINENCE(8),
        SEARCHPROMINENCECAROUSEL(9),
        THIRDPARTY(10),
        CAROUSEL(11),
        MAXVIDEO(12),
        SHOPTHEPIN(13),
        APPVIDEO(14),
        STORY(15),
        SHOWCASE(16),
        QUIZ(17),
        MOBILEDEEPLINK(18),
        LEAD(19),
        CREATIVEOPTIMIZATION(20),
        COLLAGE(21);

        private final int value;

        b(int i13) {
            this.value = i13;
        }

        public int getValue() {
            return this.value;
        }
    }

    public enum c {
        NONE(0),
        WEB(1),
        PROFILE(2),
        BOARD(3),
        STORYPIN(4),
        SAFARIAPP(5),
        SVCUNSUPPORTED(6),
        MOBILEDEEPLINK(7),
        NATIVEBROWSER(8),
        NATIVEWEBVIEW(9);

        private final int value;

        c(int i13) {
            this.value = i13;
        }

        public int getValue() {
            return this.value;
        }
    }

    public enum d {
        IMAGE(0),
        VIDEO(1),
        COLLECTIONS(2),
        CAROUSEL(3);

        private final int value;

        d(int i13) {
            this.value = i13;
        }

        public int getValue() {
            return this.value;
        }
    }

    public /* synthetic */ k(String str, String str2, a aVar, b bVar, c cVar, d dVar, String str3, boolean[] zArr, int i13) {
        this(str, str2, aVar, bVar, cVar, dVar, str3, zArr);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        k kVar = (k) obj;
        return Objects.equals(this.f39195f, kVar.f39195f) && Objects.equals(this.f39194e, kVar.f39194e) && Objects.equals(this.f39193d, kVar.f39193d) && Objects.equals(this.f39192c, kVar.f39192c) && Objects.equals(this.f39190a, kVar.f39190a) && Objects.equals(this.f39191b, kVar.f39191b) && Objects.equals(this.f39196g, kVar.f39196g);
    }

    public final a h() {
        return this.f39192c;
    }

    public final int hashCode() {
        return Objects.hash(this.f39190a, this.f39191b, this.f39192c, this.f39193d, this.f39194e, this.f39195f, this.f39196g);
    }

    public final b i() {
        return this.f39193d;
    }

    public final c j() {
        return this.f39194e;
    }

    public final d k() {
        return this.f39195f;
    }

    public final String l() {
        return this.f39196g;
    }

    public k() {
        this.f39197h = new boolean[7];
    }

    private k(@NonNull String str, String str2, a aVar, b bVar, c cVar, d dVar, String str3, boolean[] zArr) {
        this.f39190a = str;
        this.f39191b = str2;
        this.f39192c = aVar;
        this.f39193d = bVar;
        this.f39194e = cVar;
        this.f39195f = dVar;
        this.f39196g = str3;
        this.f39197h = zArr;
    }
}
