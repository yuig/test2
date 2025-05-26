package com.pinterest.api.model;

import androidx.annotation.NonNull;
import java.util.Objects;

/* loaded from: classes.dex */
public class s9 implements dl1.s {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    @om.b("id")
    private String f41827a;

    /* renamed from: b, reason: collision with root package name */
    @om.b("node_id")
    private String f41828b;

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    @om.b("board_note_list")
    private k9 f41829c;

    /* renamed from: d, reason: collision with root package name */
    @om.b("board_note_list_item")
    private o9 f41830d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean[] f41831e;

    public /* synthetic */ s9(String str, String str2, k9 k9Var, o9 o9Var, boolean[] zArr, int i13) {
        this(str, str2, k9Var, o9Var, zArr);
    }

    @Override // dl1.s
    /* renamed from: b */
    public final String getF39332b() {
        return this.f41827a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        s9 s9Var = (s9) obj;
        return Objects.equals(this.f41827a, s9Var.f41827a) && Objects.equals(this.f41828b, s9Var.f41828b) && Objects.equals(this.f41829c, s9Var.f41829c) && Objects.equals(this.f41830d, s9Var.f41830d);
    }

    public final int hashCode() {
        return Objects.hash(this.f41827a, this.f41828b, this.f41829c, this.f41830d);
    }

    @Override // dl1.s
    public final String o() {
        return this.f41828b;
    }

    public s9() {
        this.f41831e = new boolean[4];
    }

    private s9(@NonNull String str, String str2, @NonNull k9 k9Var, o9 o9Var, boolean[] zArr) {
        this.f41827a = str;
        this.f41828b = str2;
        this.f41829c = k9Var;
        this.f41830d = o9Var;
        this.f41831e = zArr;
    }
}
