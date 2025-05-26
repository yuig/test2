package com.pinterest.api.model;

import androidx.annotation.NonNull;
import java.util.Objects;

/* loaded from: classes.dex */
public class fu0 {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    @om.b("id")
    private String f37809a;

    /* renamed from: b, reason: collision with root package name */
    @om.b("node_id")
    private String f37810b;

    /* renamed from: c, reason: collision with root package name */
    @om.b("dsp_source")
    private a f37811c;

    /* renamed from: d, reason: collision with root package name */
    @om.b("privacy_data")
    private e70 f37812d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean[] f37813e;

    /* loaded from: classes3.dex */
    public enum a {
        UNKNOWN(0),
        AMAZON(1),
        GAM_HYBRID(2),
        TTD(3),
        AMAZON_SD(4),
        BING_SEARCH_SYNDICATION(5),
        IX(6),
        CRITEO(7),
        MOCK(255);

        private final int value;

        a(int i13) {
            this.value = i13;
        }

        public int getValue() {
            return this.value;
        }
    }

    public /* synthetic */ fu0(String str, String str2, a aVar, e70 e70Var, boolean[] zArr, int i13) {
        this(str, str2, aVar, e70Var, zArr);
    }

    public final a e() {
        return this.f37811c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        fu0 fu0Var = (fu0) obj;
        return Objects.equals(this.f37811c, fu0Var.f37811c) && Objects.equals(this.f37809a, fu0Var.f37809a) && Objects.equals(this.f37810b, fu0Var.f37810b) && Objects.equals(this.f37812d, fu0Var.f37812d);
    }

    public final e70 f() {
        return this.f37812d;
    }

    public final int hashCode() {
        return Objects.hash(this.f37809a, this.f37810b, this.f37811c, this.f37812d);
    }

    public fu0() {
        this.f37813e = new boolean[4];
    }

    private fu0(@NonNull String str, String str2, a aVar, e70 e70Var, boolean[] zArr) {
        this.f37809a = str;
        this.f37810b = str2;
        this.f37811c = aVar;
        this.f37812d = e70Var;
        this.f37813e = zArr;
    }
}
