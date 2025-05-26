package com.pinterest.api.model;

import java.util.Objects;

/* loaded from: classes.dex */
public class ep0 {

    /* renamed from: a, reason: collision with root package name */
    @om.b("background_color")
    private String f37317a;

    /* renamed from: b, reason: collision with root package name */
    @om.b("media_fit")
    private a f37318b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean[] f37319c;

    public enum a {
        COVER(0),
        CONTAIN(1);

        private final int value;

        a(int i13) {
            this.value = i13;
        }

        public int getValue() {
            return this.value;
        }
    }

    public /* synthetic */ ep0(String str, a aVar, boolean[] zArr, int i13) {
        this(str, aVar, zArr);
    }

    public final String c() {
        return this.f37317a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ep0 ep0Var = (ep0) obj;
        return Objects.equals(this.f37318b, ep0Var.f37318b) && Objects.equals(this.f37317a, ep0Var.f37317a);
    }

    public final int hashCode() {
        return Objects.hash(this.f37317a, this.f37318b);
    }

    public ep0() {
        this.f37319c = new boolean[2];
    }

    private ep0(String str, a aVar, boolean[] zArr) {
        this.f37317a = str;
        this.f37318b = aVar;
        this.f37319c = zArr;
    }
}
