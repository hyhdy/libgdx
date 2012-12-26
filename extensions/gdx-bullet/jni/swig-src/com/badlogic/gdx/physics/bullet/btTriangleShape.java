/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.9
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.badlogic.gdx.physics.bullet;

import com.badlogic.gdx.math.Vector3;
import com.badlogic.gdx.math.Quaternion;
import com.badlogic.gdx.math.Matrix3;
import com.badlogic.gdx.math.Matrix4;

public class btTriangleShape extends btPolyhedralConvexShape {
  private long swigCPtr;

  protected btTriangleShape(long cPtr, boolean cMemoryOwn) {
    super(gdxBulletJNI.btTriangleShape_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  public static long getCPtr(btTriangleShape obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        gdxBulletJNI.delete_btTriangleShape(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public void setM_vertices1(btVector3 value) {
    gdxBulletJNI.btTriangleShape_m_vertices1_set(swigCPtr, this, btVector3.getCPtr(value), value);
  }

  public btVector3 getM_vertices1() {
    long cPtr = gdxBulletJNI.btTriangleShape_m_vertices1_get(swigCPtr, this);
    return (cPtr == 0) ? null : new btVector3(cPtr, false);
  }

  public Vector3 getVertexPtr(int index) {
	return gdxBulletJNI.btTriangleShape_getVertexPtr__SWIG_0(swigCPtr, this, index);
}

  public btTriangleShape() {
    this(gdxBulletJNI.new_btTriangleShape__SWIG_0(), true);
  }

  public btTriangleShape(Vector3 p0, Vector3 p1, Vector3 p2) {
    this(gdxBulletJNI.new_btTriangleShape__SWIG_1(p0, p1, p2), true);
  }

  public void calcNormal(Vector3 normal) {
    gdxBulletJNI.btTriangleShape_calcNormal(swigCPtr, this, normal);
  }

  public void getPlaneEquation(int i, Vector3 planeNormal, Vector3 planeSupport) {
    gdxBulletJNI.btTriangleShape_getPlaneEquation(swigCPtr, this, i, planeNormal, planeSupport);
  }

}
