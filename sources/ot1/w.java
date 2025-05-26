package ot1;

import java.io.InputStream;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class w {

    /* renamed from: a, reason: collision with root package name */
    public final InputStream f97637a;

    /* renamed from: b, reason: collision with root package name */
    public int f97638b;

    /* renamed from: c, reason: collision with root package name */
    public int f97639c;

    public w(f input) {
        Intrinsics.checkNotNullParameter(input, "input");
        this.f97637a = input;
        this.f97638b = 7;
        this.f97639c = input.read();
    }

    public final int a() {
        int i13 = this.f97639c;
        if (i13 < 0) {
            throw new RuntimeException("Failed to parse: no more data");
        }
        int i14 = this.f97638b;
        int i15 = (i13 >> i14) & 1;
        if (i14 == 0) {
            this.f97638b = 7;
            this.f97639c = this.f97637a.read();
        } else {
            this.f97638b = i14 - 1;
        }
        return i15;
    }
}
