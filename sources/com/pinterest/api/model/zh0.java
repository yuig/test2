package com.pinterest.api.model;

import androidx.annotation.NonNull;
import java.util.Objects;

/* loaded from: classes.dex */
public class zh0 {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    @om.b("id")
    private String f44329a;

    /* renamed from: b, reason: collision with root package name */
    @om.b("node_id")
    private String f44330b;

    /* renamed from: c, reason: collision with root package name */
    @om.b("click_type")
    private a f44331c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean[] f44332d;

    /* loaded from: classes3.dex */
    public enum a {
        NONE(0),
        AMAZON_HANDSHAKE(1);

        private final int value;

        a(int i13) {
            this.value = i13;
        }

        public int getValue() {
            return this.value;
        }
    }

    public /* synthetic */ zh0(String str, String str2, a aVar, boolean[] zArr, int i13) {
        this(str, str2, aVar, zArr);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        zh0 zh0Var = (zh0) obj;
        return Objects.equals(this.f44331c, zh0Var.f44331c) && Objects.equals(this.f44329a, zh0Var.f44329a) && Objects.equals(this.f44330b, zh0Var.f44330b);
    }

    public final int hashCode() {
        return Objects.hash(this.f44329a, this.f44330b, this.f44331c);
    }

    public zh0() {
        this.f44332d = new boolean[3];
    }

    private zh0(@NonNull String str, String str2, a aVar, boolean[] zArr) {
        this.f44329a = str;
        this.f44330b = str2;
        this.f44331c = aVar;
        this.f44332d = zArr;
    }
}
