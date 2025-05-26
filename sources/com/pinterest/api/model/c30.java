package com.pinterest.api.model;

import android.graphics.BitmapFactory;
import java.io.File;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final class c30 extends kotlin.jvm.internal.s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ String f36286i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c30(String str) {
        super(0);
        this.f36286i = str;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeFile(new File(this.f36286i).getAbsolutePath(), options);
        return new Pair(Integer.valueOf(options.outWidth), Integer.valueOf(options.outHeight));
    }
}
