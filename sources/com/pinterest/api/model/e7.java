package com.pinterest.api.model;

import androidx.annotation.NonNull;
import com.pinterest.featurelibrary.pingridcell.sba.view.SbaPinRep;
import java.util.Objects;

/* loaded from: classes.dex */
public class e7 {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    @om.b("id")
    private String f37188a;

    /* renamed from: b, reason: collision with root package name */
    @om.b("node_id")
    private String f37189b;

    /* renamed from: c, reason: collision with root package name */
    @om.b("badge_label")
    private String f37190c;

    /* renamed from: d, reason: collision with root package name */
    @om.b(SbaPinRep.AUX_DATA_BADGE_LABEL_ENUM)
    private a f37191d;

    /* renamed from: e, reason: collision with root package name */
    @om.b("badge_type")
    private b f37192e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean[] f37193f;

    public enum a {
        BRAND_FOR_YOU(1),
        DEAL(2);

        private final int value;

        a(int i13) {
            this.value = i13;
        }

        public int getValue() {
            return this.value;
        }
    }

    public enum b {
        ROUND(1),
        CORNER(2);

        private final int value;

        b(int i13) {
            this.value = i13;
        }

        public int getValue() {
            return this.value;
        }
    }

    public /* synthetic */ e7(String str, String str2, String str3, a aVar, b bVar, boolean[] zArr, int i13) {
        this(str, str2, str3, aVar, bVar, zArr);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        e7 e7Var = (e7) obj;
        return Objects.equals(this.f37192e, e7Var.f37192e) && Objects.equals(this.f37191d, e7Var.f37191d) && Objects.equals(this.f37188a, e7Var.f37188a) && Objects.equals(this.f37189b, e7Var.f37189b) && Objects.equals(this.f37190c, e7Var.f37190c);
    }

    public final String f() {
        return this.f37190c;
    }

    public final a g() {
        return this.f37191d;
    }

    public final b h() {
        return this.f37192e;
    }

    public final int hashCode() {
        return Objects.hash(this.f37188a, this.f37189b, this.f37190c, this.f37191d, this.f37192e);
    }

    public e7() {
        this.f37193f = new boolean[5];
    }

    private e7(@NonNull String str, String str2, String str3, a aVar, b bVar, boolean[] zArr) {
        this.f37188a = str;
        this.f37189b = str2;
        this.f37190c = str3;
        this.f37191d = aVar;
        this.f37192e = bVar;
        this.f37193f = zArr;
    }
}
