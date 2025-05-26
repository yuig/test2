package jp2;

import java.nio.ByteBuffer;
import org.chromium.net.impl.CronetBidirectionalStream;

/* loaded from: classes4.dex */
public final class d implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f77318a = 0;

    /* renamed from: b, reason: collision with root package name */
    public ByteBuffer f77319b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f77320c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ CronetBidirectionalStream f77321d;

    public /* synthetic */ d(CronetBidirectionalStream cronetBidirectionalStream, int i13) {
        this(cronetBidirectionalStream);
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z13 = true;
        boolean z14 = false;
        switch (this.f77318a) {
            case 0:
                try {
                    ByteBuffer byteBuffer = this.f77319b;
                    this.f77319b = null;
                    synchronized (this.f77321d.f97359q) {
                        try {
                            if (this.f77321d.h()) {
                                return;
                            }
                            boolean z15 = this.f77320c;
                            if (z15) {
                                CronetBidirectionalStream cronetBidirectionalStream = this.f77321d;
                                cronetBidirectionalStream.f97366x = 4;
                                if (cronetBidirectionalStream.f97367y != 10) {
                                    z13 = false;
                                }
                                z14 = z13;
                            } else {
                                this.f77321d.f97366x = 2;
                            }
                            CronetBidirectionalStream cronetBidirectionalStream2 = this.f77321d;
                            cronetBidirectionalStream2.f97345c.onReadCompleted(cronetBidirectionalStream2, cronetBidirectionalStream2.f97368z, byteBuffer, z15);
                            if (z14) {
                                CronetBidirectionalStream.a(this.f77321d);
                                return;
                            }
                            return;
                        } finally {
                        }
                    }
                } catch (Exception e13) {
                    CronetBidirectionalStream.b(this.f77321d, e13);
                    return;
                }
            default:
                try {
                    ByteBuffer byteBuffer2 = this.f77319b;
                    this.f77319b = null;
                    synchronized (this.f77321d.f97359q) {
                        try {
                            if (this.f77321d.h()) {
                                return;
                            }
                            boolean z16 = this.f77320c;
                            if (z16) {
                                CronetBidirectionalStream cronetBidirectionalStream3 = this.f77321d;
                                cronetBidirectionalStream3.f97367y = 10;
                                if (cronetBidirectionalStream3.f97366x != 4) {
                                    z13 = false;
                                }
                                z14 = z13;
                            }
                            CronetBidirectionalStream cronetBidirectionalStream4 = this.f77321d;
                            cronetBidirectionalStream4.f97345c.onWriteCompleted(cronetBidirectionalStream4, cronetBidirectionalStream4.f97368z, byteBuffer2, z16);
                            if (z14) {
                                CronetBidirectionalStream.a(this.f77321d);
                                return;
                            }
                            return;
                        } finally {
                        }
                    }
                } catch (Exception e14) {
                    CronetBidirectionalStream.b(this.f77321d, e14);
                    return;
                }
        }
    }

    public d(CronetBidirectionalStream cronetBidirectionalStream) {
        this.f77321d = cronetBidirectionalStream;
    }

    public d(CronetBidirectionalStream cronetBidirectionalStream, ByteBuffer byteBuffer, boolean z13) {
        this.f77321d = cronetBidirectionalStream;
        this.f77319b = byteBuffer;
        this.f77320c = z13;
    }
}
