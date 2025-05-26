package com.bumptech.glide.load.data;

import android.content.ContentResolver;
import android.content.res.AssetManager;
import android.net.Uri;
import android.util.Log;
import java.io.Closeable;
import java.io.FileNotFoundException;
import java.io.IOException;

/* loaded from: classes3.dex */
public abstract class b implements e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f29795a;

    /* renamed from: b, reason: collision with root package name */
    public Object f29796b;

    /* renamed from: c, reason: collision with root package name */
    public final Comparable f29797c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f29798d;

    public /* synthetic */ b(Object obj, Comparable comparable, int i13) {
        this.f29795a = i13;
        this.f29798d = obj;
        this.f29797c = comparable;
    }

    @Override // com.bumptech.glide.load.data.e
    public final void b() {
        switch (this.f29795a) {
            case 0:
                Object obj = this.f29796b;
                if (obj != null) {
                    try {
                        d(obj);
                        break;
                    } catch (IOException unused) {
                        return;
                    }
                }
                break;
            default:
                Object obj2 = this.f29796b;
                if (obj2 != null) {
                    try {
                        d(obj2);
                        break;
                    } catch (IOException unused2) {
                        return;
                    }
                }
                break;
        }
    }

    @Override // com.bumptech.glide.load.data.e
    public final nd.a c() {
        switch (this.f29795a) {
        }
        return nd.a.LOCAL;
    }

    @Override // com.bumptech.glide.load.data.e
    public final void cancel() {
    }

    public abstract void d(Object obj);

    @Override // com.bumptech.glide.load.data.e
    public final void e(com.bumptech.glide.h hVar, d dVar) {
        int i13 = this.f29795a;
        Object obj = this.f29798d;
        Comparable comparable = this.f29797c;
        switch (i13) {
            case 0:
                try {
                    Closeable f13 = f((AssetManager) obj, (String) comparable);
                    this.f29796b = f13;
                    dVar.f(f13);
                    break;
                } catch (IOException e13) {
                    if (Log.isLoggable("AssetPathFetcher", 3)) {
                        Log.d("AssetPathFetcher", "Failed to load data from asset manager", e13);
                    }
                    dVar.d(e13);
                }
            default:
                try {
                    Object g13 = g((ContentResolver) obj, (Uri) comparable);
                    this.f29796b = g13;
                    dVar.f(g13);
                    break;
                } catch (FileNotFoundException e14) {
                    if (Log.isLoggable("LocalUriFetcher", 3)) {
                        Log.d("LocalUriFetcher", "Failed to open Uri", e14);
                    }
                    dVar.d(e14);
                    return;
                }
        }
    }

    public abstract Closeable f(AssetManager assetManager, String str);

    public abstract Object g(ContentResolver contentResolver, Uri uri);
}
