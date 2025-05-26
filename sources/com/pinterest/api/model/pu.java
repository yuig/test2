package com.pinterest.api.model;

import android.net.Uri;
import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0016\u0018\u00002\u00020\u00012\u00020\u0002B\u0011\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000b"}, d2 = {"Lcom/pinterest/api/model/pu;", "Lcom/pinterest/api/model/wx;", "Ldl1/s;", "", "a", "Ljava/lang/String;", "e", "()Ljava/lang/String;", "path", "<init>", "(Ljava/lang/String;)V", "models_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public class pu extends wx {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @om.b("path")
    @NotNull
    private final String path;

    /* renamed from: b, reason: collision with root package name */
    public final Uri f41101b;

    public pu() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public boolean a() {
        return this.path.length() > 0 && new File(this.path).exists();
    }

    @Override // dl1.s
    /* renamed from: b, reason: from getter */
    public final String getPath() {
        return this.path;
    }

    public final String e() {
        return this.path;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof pu) {
            return Intrinsics.d(this.path, ((pu) obj).path);
        }
        return false;
    }

    public boolean g() {
        return true;
    }

    public /* synthetic */ pu(String str, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? "" : str);
    }

    public pu(@NotNull String path) {
        Intrinsics.checkNotNullParameter(path, "path");
        this.path = path;
        Uri fromFile = Uri.fromFile(new File(path));
        Intrinsics.checkNotNullExpressionValue(fromFile, "fromFile(...)");
        this.f41101b = fromFile;
    }
}
