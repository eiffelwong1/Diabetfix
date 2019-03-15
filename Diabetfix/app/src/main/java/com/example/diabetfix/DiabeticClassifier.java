package com.example.diabetfix;

class DiabeticClassifier {
    public static int predict_0(double[] features) {
        int[] classes = new int[2];
        
        if (features[2] <= 28.5) {
            if (features[2] <= 23.5) {
                if (features[2] <= 21.5) {
                    if (features[1] <= 33.400001525878906) {
                        classes[0] = 41; 
                        classes[1] = 0; 
                    } else {
                        if (features[0] <= 2.5) {
                            if (features[0] <= 1.5) {
                                if (features[1] <= 35.19999694824219) {
                                    classes[0] = 0; 
                                    classes[1] = 4; 
                                } else {
                                    classes[0] = 4; 
                                    classes[1] = 0; 
                                }
                            } else {
                                classes[0] = 0; 
                                classes[1] = 1; 
                            }
                        } else {
                            classes[0] = 1; 
                            classes[1] = 0; 
                        }
                    }
                } else {
                    if (features[0] <= 0.5) {
                        if (features[2] <= 22.5) {
                            if (features[1] <= 31.399999618530273) {
                                classes[0] = 8; 
                                classes[1] = 0; 
                            } else {
                                if (features[1] <= 36.54999923706055) {
                                    classes[0] = 0; 
                                    classes[1] = 4; 
                                } else {
                                    classes[0] = 7; 
                                    classes[1] = 0; 
                                }
                            }
                        } else {
                            if (features[1] <= 34.099998474121094) {
                                classes[0] = 0; 
                                classes[1] = 2; 
                            } else {
                                classes[0] = 6; 
                                classes[1] = 0; 
                            }
                        }
                    } else {
                        if (features[1] <= 38.599998474121094) {
                            if (features[0] <= 3.5) {
                                classes[0] = 58; 
                                classes[1] = 0; 
                            } else {
                                if (features[1] <= 32.849998474121094) {
                                    classes[0] = 6; 
                                    classes[1] = 0; 
                                } else {
                                    classes[0] = 0; 
                                    classes[1] = 1; 
                                }
                            }
                        } else {
                            if (features[2] <= 22.5) {
                                classes[0] = 0; 
                                classes[1] = 3; 
                            } else {
                                if (features[1] <= 44.5) {
                                    classes[0] = 2; 
                                    classes[1] = 0; 
                                } else {
                                    classes[0] = 0; 
                                    classes[1] = 2; 
                                }
                            }
                        }
                    }
                }
            } else {
                if (features[2] <= 24.5) {
                    if (features[0] <= 2.5) {
                        if (features[1] <= 39.95000076293945) {
                            classes[0] = 16; 
                            classes[1] = 0; 
                        } else {
                            if (features[1] <= 44.849998474121094) {
                                classes[0] = 0; 
                                classes[1] = 4; 
                            } else {
                                classes[0] = 5; 
                                classes[1] = 0; 
                            }
                        }
                    } else {
                        if (features[1] <= 32.45000076293945) {
                            classes[0] = 8; 
                            classes[1] = 0; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 3; 
                        }
                    }
                } else {
                    if (features[2] <= 25.5) {
                        if (features[1] <= 30.850000381469727) {
                            classes[0] = 24; 
                            classes[1] = 0; 
                        } else {
                            if (features[0] <= 4.5) {
                                if (features[1] <= 31.75) {
                                    classes[0] = 0; 
                                    classes[1] = 2; 
                                } else {
                                    if (features[0] <= 0.5) {
                                        if (features[1] <= 40.95000076293945) {
                                            if (features[1] <= 36.69999694824219) {
                                                if (features[1] <= 35.79999923706055) {
                                                    classes[0] = 1; 
                                                    classes[1] = 0; 
                                                } else {
                                                    classes[0] = 0; 
                                                    classes[1] = 2; 
                                                }
                                            } else {
                                                classes[0] = 3; 
                                                classes[1] = 0; 
                                            }
                                        } else {
                                            classes[0] = 0; 
                                            classes[1] = 2; 
                                        }
                                    } else {
                                        if (features[1] <= 34.650001525878906) {
                                            classes[0] = 7; 
                                            classes[1] = 0; 
                                        } else {
                                            if (features[1] <= 37.75) {
                                                if (features[1] <= 35.20000076293945) {
                                                    classes[0] = 0; 
                                                    classes[1] = 2; 
                                                } else {
                                                    if (features[0] <= 2.0) {
                                                        classes[0] = 2; 
                                                        classes[1] = 0; 
                                                    } else {
                                                        classes[0] = 0; 
                                                        classes[1] = 2; 
                                                    }
                                                }
                                            } else {
                                                classes[0] = 5; 
                                                classes[1] = 0; 
                                            }
                                        }
                                    }
                                }
                            } else {
                                classes[0] = 0; 
                                classes[1] = 3; 
                            }
                        }
                    } else {
                        if (features[0] <= 3.5) {
                            if (features[0] <= 0.5) {
                                if (features[1] <= 40.94999694824219) {
                                    classes[0] = 9; 
                                    classes[1] = 0; 
                                } else {
                                    if (features[1] <= 43.70000076293945) {
                                        if (features[2] <= 26.5) {
                                            classes[0] = 0; 
                                            classes[1] = 3; 
                                        } else {
                                            if (features[1] <= 41.400001525878906) {
                                                classes[0] = 0; 
                                                classes[1] = 2; 
                                            } else {
                                                classes[0] = 1; 
                                                classes[1] = 0; 
                                            }
                                        }
                                    } else {
                                        if (features[2] <= 26.5) {
                                            if (features[1] <= 57.5) {
                                                classes[0] = 1; 
                                                classes[1] = 0; 
                                            } else {
                                                classes[0] = 0; 
                                                classes[1] = 2; 
                                            }
                                        } else {
                                            classes[0] = 1; 
                                            classes[1] = 0; 
                                        }
                                    }
                                }
                            } else {
                                if (features[2] <= 26.5) {
                                    if (features[0] <= 2.5) {
                                        classes[0] = 9; 
                                        classes[1] = 0; 
                                    } else {
                                        if (features[1] <= 32.099998474121094) {
                                            if (features[1] <= 30.899999618530273) {
                                                classes[0] = 2; 
                                                classes[1] = 0; 
                                            } else {
                                                classes[0] = 0; 
                                                classes[1] = 1; 
                                            }
                                        } else {
                                            classes[0] = 5; 
                                            classes[1] = 0; 
                                        }
                                    }
                                } else {
                                    if (features[1] <= 26.200000762939453) {
                                        classes[0] = 7; 
                                        classes[1] = 0; 
                                    } else {
                                        if (features[2] <= 27.5) {
                                            if (features[1] <= 27.299999237060547) {
                                                classes[0] = 0; 
                                                classes[1] = 2; 
                                            } else {
                                                if (features[0] <= 2.5) {
                                                    if (features[1] <= 44.44999694824219) {
                                                        classes[0] = 5; 
                                                        classes[1] = 0; 
                                                    } else {
                                                        classes[0] = 0; 
                                                        classes[1] = 1; 
                                                    }
                                                } else {
                                                    if (features[1] <= 36.75) {
                                                        classes[0] = 0; 
                                                        classes[1] = 2; 
                                                    } else {
                                                        classes[0] = 2; 
                                                        classes[1] = 0; 
                                                    }
                                                }
                                            }
                                        } else {
                                            if (features[0] <= 2.5) {
                                                if (features[1] <= 37.29999923706055) {
                                                    classes[0] = 0; 
                                                    classes[1] = 3; 
                                                } else {
                                                    if (features[1] <= 41.849998474121094) {
                                                        classes[0] = 1; 
                                                        classes[1] = 0; 
                                                    } else {
                                                        classes[0] = 0; 
                                                        classes[1] = 1; 
                                                    }
                                                }
                                            } else {
                                                if (features[1] <= 34.849998474121094) {
                                                    classes[0] = 1; 
                                                    classes[1] = 2; 
                                                } else {
                                                    classes[0] = 3; 
                                                    classes[1] = 0; 
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        } else {
                            if (features[2] <= 27.5) {
                                if (features[2] <= 26.5) {
                                    classes[0] = 4; 
                                    classes[1] = 0; 
                                } else {
                                    if (features[1] <= 29.549999237060547) {
                                        classes[0] = 3; 
                                        classes[1] = 0; 
                                    } else {
                                        if (features[1] <= 35.0) {
                                            classes[0] = 0; 
                                            classes[1] = 2; 
                                        } else {
                                            classes[0] = 3; 
                                            classes[1] = 0; 
                                        }
                                    }
                                }
                            } else {
                                classes[0] = 20; 
                                classes[1] = 0; 
                            }
                        }
                    }
                }
            }
        } else {
            if (features[0] <= 4.5) {
                if (features[1] <= 26.799999237060547) {
                    if (features[0] <= 1.5) {
                        if (features[0] <= 0.5) {
                            classes[0] = 7; 
                            classes[1] = 0; 
                        } else {
                            if (features[2] <= 34.5) {
                                if (features[1] <= 25.0) {
                                    classes[0] = 0; 
                                    classes[1] = 1; 
                                } else {
                                    classes[0] = 3; 
                                    classes[1] = 0; 
                                }
                            } else {
                                classes[0] = 4; 
                                classes[1] = 0; 
                            }
                        }
                    } else {
                        classes[0] = 14; 
                        classes[1] = 0; 
                    }
                } else {
                    if (features[2] <= 46.5) {
                        if (features[1] <= 48.25) {
                            if (features[0] <= 3.5) {
                                if (features[2] <= 43.0) {
                                    if (features[0] <= 1.5) {
                                        if (features[1] <= 45.94999694824219) {
                                            if (features[2] <= 35.5) {
                                                if (features[0] <= 0.5) {
                                                    if (features[1] <= 43.80000305175781) {
                                                        if (features[1] <= 38.80000305175781) {
                                                            classes[0] = 4; 
                                                            classes[1] = 0; 
                                                        } else {
                                                            if (features[2] <= 34.0) {
                                                                classes[0] = 0; 
                                                                classes[1] = 3; 
                                                            } else {
                                                                classes[0] = 4; 
                                                                classes[1] = 0; 
                                                            }
                                                        }
                                                    } else {
                                                        classes[0] = 0; 
                                                        classes[1] = 2; 
                                                    }
                                                } else {
                                                    if (features[1] <= 43.44999694824219) {
                                                        classes[0] = 5; 
                                                        classes[1] = 0; 
                                                    } else {
                                                        classes[0] = 0; 
                                                        classes[1] = 1; 
                                                    }
                                                }
                                            } else {
                                                if (features[1] <= 36.70000076293945) {
                                                    classes[0] = 0; 
                                                    classes[1] = 5; 
                                                } else {
                                                    if (features[1] <= 39.20000076293945) {
                                                        classes[0] = 1; 
                                                        classes[1] = 0; 
                                                    } else {
                                                        classes[0] = 0; 
                                                        classes[1] = 1; 
                                                    }
                                                }
                                            }
                                        } else {
                                            classes[0] = 5; 
                                            classes[1] = 0; 
                                        }
                                    } else {
                                        if (features[1] <= 36.849998474121094) {
                                            if (features[0] <= 2.5) {
                                                if (features[1] <= 33.599998474121094) {
                                                    if (features[2] <= 31.5) {
                                                        classes[0] = 0; 
                                                        classes[1] = 3; 
                                                    } else {
                                                        classes[0] = 2; 
                                                        classes[1] = 0; 
                                                    }
                                                } else {
                                                    classes[0] = 0; 
                                                    classes[1] = 3; 
                                                }
                                            } else {
                                                if (features[1] <= 32.70000076293945) {
                                                    if (features[1] <= 29.700000762939453) {
                                                        classes[0] = 2; 
                                                        classes[1] = 0; 
                                                    } else {
                                                        if (features[1] <= 30.0) {
                                                            classes[0] = 0; 
                                                            classes[1] = 1; 
                                                        } else {
                                                            if (features[1] <= 30.450000762939453) {
                                                                classes[0] = 2; 
                                                                classes[1] = 0; 
                                                            } else {
                                                                if (features[1] <= 30.700000762939453) {
                                                                    classes[0] = 0; 
                                                                    classes[1] = 1; 
                                                                } else {
                                                                    classes[0] = 2; 
                                                                    classes[1] = 0; 
                                                                }
                                                            }
                                                        }
                                                    }
                                                } else {
                                                    classes[0] = 0; 
                                                    classes[1] = 5; 
                                                }
                                            }
                                        } else {
                                            if (features[1] <= 43.099998474121094) {
                                                classes[0] = 6; 
                                                classes[1] = 0; 
                                            } else {
                                                classes[0] = 0; 
                                                classes[1] = 2; 
                                            }
                                        }
                                    }
                                } else {
                                    if (features[0] <= 0.5) {
                                        classes[0] = 5; 
                                        classes[1] = 0; 
                                    } else {
                                        if (features[0] <= 2.0) {
                                            classes[0] = 1; 
                                            classes[1] = 1; 
                                        } else {
                                            classes[0] = 1; 
                                            classes[1] = 0; 
                                        }
                                    }
                                }
                            } else {
                                if (features[2] <= 42.5) {
                                    if (features[1] <= 31.049999237060547) {
                                        if (features[1] <= 29.650001525878906) {
                                            if (features[1] <= 28.849998474121094) {
                                                if (features[2] <= 38.0) {
                                                    classes[0] = 0; 
                                                    classes[1] = 2; 
                                                } else {
                                                    classes[0] = 4; 
                                                    classes[1] = 0; 
                                                }
                                            } else {
                                                classes[0] = 5; 
                                                classes[1] = 0; 
                                            }
                                        } else {
                                            if (features[2] <= 34.5) {
                                                classes[0] = 0; 
                                                classes[1] = 6; 
                                            } else {
                                                classes[0] = 1; 
                                                classes[1] = 0; 
                                            }
                                        }
                                    } else {
                                        if (features[1] <= 31.950000762939453) {
                                            classes[0] = 5; 
                                            classes[1] = 0; 
                                        } else {
                                            if (features[2] <= 30.5) {
                                                classes[0] = 8; 
                                                classes[1] = 0; 
                                            } else {
                                                if (features[2] <= 37.5) {
                                                    if (features[1] <= 36.849998474121094) {
                                                        if (features[2] <= 34.5) {
                                                            if (features[2] <= 32.0) {
                                                                if (features[1] <= 34.80000305175781) {
                                                                    classes[0] = 0; 
                                                                    classes[1] = 1; 
                                                                } else {
                                                                    classes[0] = 1; 
                                                                    classes[1] = 0; 
                                                                }
                                                            } else {
                                                                classes[0] = 2; 
                                                                classes[1] = 0; 
                                                            }
                                                        } else {
                                                            classes[0] = 0; 
                                                            classes[1] = 1; 
                                                        }
                                                    } else {
                                                        classes[0] = 0; 
                                                        classes[1] = 2; 
                                                    }
                                                } else {
                                                    classes[0] = 1; 
                                                    classes[1] = 0; 
                                                }
                                            }
                                        }
                                    }
                                } else {
                                    classes[0] = 0; 
                                    classes[1] = 2; 
                                }
                            }
                        } else {
                            classes[0] = 0; 
                            classes[1] = 2; 
                        }
                    } else {
                        if (features[2] <= 62.5) {
                            if (features[2] <= 55.0) {
                                if (features[2] <= 53.5) {
                                    classes[0] = 0; 
                                    classes[1] = 5; 
                                } else {
                                    classes[0] = 3; 
                                    classes[1] = 0; 
                                }
                            } else {
                                classes[0] = 0; 
                                classes[1] = 7; 
                            }
                        } else {
                            if (features[0] <= 2.5) {
                                classes[0] = 0; 
                                classes[1] = 1; 
                            } else {
                                classes[0] = 3; 
                                classes[1] = 0; 
                            }
                        }
                    }
                }
            } else {
                if (features[0] <= 10.5) {
                    if (features[2] <= 54.5) {
                        if (features[1] <= 37.400001525878906) {
                            if (features[0] <= 9.5) {
                                if (features[2] <= 45.5) {
                                    if (features[2] <= 29.5) {
                                        classes[0] = 0; 
                                        classes[1] = 5; 
                                    } else {
                                        if (features[2] <= 30.5) {
                                            classes[0] = 6; 
                                            classes[1] = 0; 
                                        } else {
                                            if (features[1] <= 26.650001525878906) {
                                                if (features[2] <= 32.5) {
                                                    if (features[0] <= 7.5) {
                                                        classes[0] = 4; 
                                                        classes[1] = 0; 
                                                    } else {
                                                        classes[0] = 0; 
                                                        classes[1] = 1; 
                                                    }
                                                } else {
                                                    classes[0] = 6; 
                                                    classes[1] = 0; 
                                                }
                                            } else {
                                                if (features[2] <= 37.5) {
                                                    if (features[1] <= 34.599998474121094) {
                                                        if (features[2] <= 32.5) {
                                                            if (features[2] <= 31.5) {
                                                                if (features[0] <= 6.5) {
                                                                    classes[0] = 2; 
                                                                    classes[1] = 0; 
                                                                } else {
                                                                    classes[0] = 0; 
                                                                    classes[1] = 4; 
                                                                }
                                                            } else {
                                                                if (features[0] <= 6.5) {
                                                                    if (features[1] <= 29.5) {
                                                                        classes[0] = 1; 
                                                                        classes[1] = 1; 
                                                                    } else {
                                                                        classes[0] = 3; 
                                                                        classes[1] = 0; 
                                                                    }
                                                                } else {
                                                                    classes[0] = 0; 
                                                                    classes[1] = 3; 
                                                                }
                                                            }
                                                        } else {
                                                            if (features[1] <= 33.44999694824219) {
                                                                if (features[0] <= 5.5) {
                                                                    classes[0] = 0; 
                                                                    classes[1] = 3; 
                                                                } else {
                                                                    if (features[1] <= 29.099998474121094) {
                                                                        classes[0] = 0; 
                                                                        classes[1] = 4; 
                                                                    } else {
                                                                        if (features[0] <= 7.5) {
                                                                            if (features[2] <= 36.5) {
                                                                                classes[0] = 0; 
                                                                                classes[1] = 1; 
                                                                            } else {
                                                                                classes[0] = 1; 
                                                                                classes[1] = 0; 
                                                                            }
                                                                        } else {
                                                                            classes[0] = 0; 
                                                                            classes[1] = 2; 
                                                                        }
                                                                    }
                                                                }
                                                            } else {
                                                                if (features[1] <= 33.75) {
                                                                    classes[0] = 2; 
                                                                    classes[1] = 0; 
                                                                } else {
                                                                    classes[0] = 0; 
                                                                    classes[1] = 3; 
                                                                }
                                                            }
                                                        }
                                                    } else {
                                                        classes[0] = 4; 
                                                        classes[1] = 0; 
                                                    }
                                                } else {
                                                    if (features[2] <= 42.5) {
                                                        if (features[2] <= 39.5) {
                                                            if (features[1] <= 32.79999923706055) {
                                                                classes[0] = 3; 
                                                                classes[1] = 0; 
                                                            } else {
                                                                if (features[2] <= 38.5) {
                                                                    if (features[1] <= 34.04999923706055) {
                                                                        classes[0] = 0; 
                                                                        classes[1] = 1; 
                                                                    } else {
                                                                        classes[0] = 1; 
                                                                        classes[1] = 0; 
                                                                    }
                                                                } else {
                                                                    classes[0] = 1; 
                                                                    classes[1] = 0; 
                                                                }
                                                            }
                                                        } else {
                                                            if (features[0] <= 7.5) {
                                                                if (features[1] <= 32.69999694824219) {
                                                                    if (features[2] <= 41.5) {
                                                                        if (features[0] <= 6.5) {
                                                                            classes[0] = 0; 
                                                                            classes[1] = 2; 
                                                                        } else {
                                                                            classes[0] = 3; 
                                                                            classes[1] = 0; 
                                                                        }
                                                                    } else {
                                                                        classes[0] = 3; 
                                                                        classes[1] = 0; 
                                                                    }
                                                                } else {
                                                                    if (features[2] <= 40.5) {
                                                                        classes[0] = 0; 
                                                                        classes[1] = 2; 
                                                                    } else {
                                                                        if (features[1] <= 33.04999923706055) {
                                                                            classes[0] = 0; 
                                                                            classes[1] = 2; 
                                                                        } else {
                                                                            if (features[1] <= 35.099998474121094) {
                                                                                classes[0] = 2; 
                                                                                classes[1] = 0; 
                                                                            } else {
                                                                                classes[0] = 0; 
                                                                                classes[1] = 1; 
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            } else {
                                                                if (features[1] <= 33.69999694824219) {
                                                                    classes[0] = 8; 
                                                                    classes[1] = 0; 
                                                                } else {
                                                                    classes[0] = 0; 
                                                                    classes[1] = 1; 
                                                                }
                                                            }
                                                        }
                                                    } else {
                                                        if (features[2] <= 44.5) {
                                                            if (features[2] <= 43.5) {
                                                                if (features[1] <= 32.0) {
                                                                    classes[0] = 0; 
                                                                    classes[1] = 1; 
                                                                } else {
                                                                    classes[0] = 1; 
                                                                    classes[1] = 0; 
                                                                }
                                                            } else {
                                                                classes[0] = 0; 
                                                                classes[1] = 1; 
                                                            }
                                                        } else {
                                                            if (features[1] <= 34.400001525878906) {
                                                                if (features[1] <= 31.650001525878906) {
                                                                    classes[0] = 1; 
                                                                    classes[1] = 0; 
                                                                } else {
                                                                    classes[0] = 0; 
                                                                    classes[1] = 2; 
                                                                }
                                                            } else {
                                                                classes[0] = 2; 
                                                                classes[1] = 0; 
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                } else {
                                    if (features[2] <= 51.5) {
                                        if (features[2] <= 47.5) {
                                            classes[0] = 0; 
                                            classes[1] = 5; 
                                        } else {
                                            if (features[1] <= 23.5) {
                                                classes[0] = 1; 
                                                classes[1] = 0; 
                                            } else {
                                                if (features[0] <= 8.5) {
                                                    if (features[0] <= 6.5) {
                                                        if (features[1] <= 27.299999237060547) {
                                                            classes[0] = 0; 
                                                            classes[1] = 3; 
                                                        } else {
                                                            if (features[1] <= 31.19999885559082) {
                                                                classes[0] = 1; 
                                                                classes[1] = 0; 
                                                            } else {
                                                                if (features[2] <= 49.5) {
                                                                    classes[0] = 1; 
                                                                    classes[1] = 0; 
                                                                } else {
                                                                    classes[0] = 0; 
                                                                    classes[1] = 2; 
                                                                }
                                                            }
                                                        }
                                                    } else {
                                                        if (features[0] <= 7.5) {
                                                            if (features[2] <= 50.5) {
                                                                classes[0] = 2; 
                                                                classes[1] = 0; 
                                                            } else {
                                                                if (features[1] <= 30.950000762939453) {
                                                                    classes[0] = 1; 
                                                                    classes[1] = 0; 
                                                                } else {
                                                                    classes[0] = 0; 
                                                                    classes[1] = 1; 
                                                                }
                                                            }
                                                        } else {
                                                            classes[0] = 2; 
                                                            classes[1] = 0; 
                                                        }
                                                    }
                                                } else {
                                                    classes[0] = 0; 
                                                    classes[1] = 4; 
                                                }
                                            }
                                        }
                                    } else {
                                        classes[0] = 0; 
                                        classes[1] = 7; 
                                    }
                                }
                            } else {
                                if (features[1] <= 27.549999237060547) {
                                    if (features[1] <= 25.700000762939453) {
                                        classes[0] = 0; 
                                        classes[1] = 2; 
                                    } else {
                                        if (features[2] <= 35.5) {
                                            classes[0] = 3; 
                                            classes[1] = 0; 
                                        } else {
                                            classes[0] = 0; 
                                            classes[1] = 2; 
                                        }
                                    }
                                } else {
                                    classes[0] = 12; 
                                    classes[1] = 0; 
                                }
                            }
                        } else {
                            if (features[1] <= 38.150001525878906) {
                                classes[0] = 0; 
                                classes[1] = 8; 
                            } else {
                                if (features[1] <= 38.849998474121094) {
                                    classes[0] = 2; 
                                    classes[1] = 0; 
                                } else {
                                    if (features[2] <= 36.5) {
                                        classes[0] = 0; 
                                        classes[1] = 12; 
                                    } else {
                                        if (features[2] <= 46.5) {
                                            if (features[0] <= 7.5) {
                                                if (features[1] <= 40.900001525878906) {
                                                    if (features[0] <= 5.5) {
                                                        if (features[1] <= 39.29999923706055) {
                                                            if (features[2] <= 39.5) {
                                                                classes[0] = 0; 
                                                                classes[1] = 1; 
                                                            } else {
                                                                classes[0] = 2; 
                                                                classes[1] = 0; 
                                                            }
                                                        } else {
                                                            classes[0] = 1; 
                                                            classes[1] = 0; 
                                                        }
                                                    } else {
                                                        if (features[0] <= 6.5) {
                                                            if (features[2] <= 43.0) {
                                                                classes[0] = 0; 
                                                                classes[1] = 2; 
                                                            } else {
                                                                classes[0] = 1; 
                                                                classes[1] = 0; 
                                                            }
                                                        } else {
                                                            if (features[2] <= 39.0) {
                                                                classes[0] = 3; 
                                                                classes[1] = 0; 
                                                            } else {
                                                                classes[0] = 0; 
                                                                classes[1] = 2; 
                                                            }
                                                        }
                                                    }
                                                } else {
                                                    if (features[2] <= 39.5) {
                                                        classes[0] = 0; 
                                                        classes[1] = 2; 
                                                    } else {
                                                        if (features[1] <= 46.45000076293945) {
                                                            classes[0] = 0; 
                                                            classes[1] = 2; 
                                                        } else {
                                                            classes[0] = 1; 
                                                            classes[1] = 0; 
                                                        }
                                                    }
                                                }
                                            } else {
                                                classes[0] = 0; 
                                                classes[1] = 9; 
                                            }
                                        } else {
                                            if (features[2] <= 50.0) {
                                                classes[0] = 2; 
                                                classes[1] = 0; 
                                            } else {
                                                classes[0] = 0; 
                                                classes[1] = 1; 
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    } else {
                        if (features[0] <= 8.5) {
                            if (features[1] <= 31.75) {
                                if (features[2] <= 59.5) {
                                    if (features[1] <= 23.850000381469727) {
                                        classes[0] = 0; 
                                        classes[1] = 1; 
                                    } else {
                                        if (features[0] <= 6.5) {
                                            classes[0] = 2; 
                                            classes[1] = 0; 
                                        } else {
                                            if (features[0] <= 7.5) {
                                                classes[0] = 0; 
                                                classes[1] = 1; 
                                            } else {
                                                classes[0] = 2; 
                                                classes[1] = 0; 
                                            }
                                        }
                                    }
                                } else {
                                    classes[0] = 10; 
                                    classes[1] = 0; 
                                }
                            } else {
                                if (features[1] <= 35.54999923706055) {
                                    classes[0] = 0; 
                                    classes[1] = 3; 
                                } else {
                                    if (features[2] <= 61.0) {
                                        if (features[2] <= 56.0) {
                                            classes[0] = 2; 
                                            classes[1] = 0; 
                                        } else {
                                            if (features[1] <= 37.150001525878906) {
                                                classes[0] = 1; 
                                                classes[1] = 0; 
                                            } else {
                                                classes[0] = 0; 
                                                classes[1] = 1; 
                                            }
                                        }
                                    } else {
                                        classes[0] = 3; 
                                        classes[1] = 0; 
                                    }
                                }
                            }
                        } else {
                            classes[0] = 10; 
                            classes[1] = 0; 
                        }
                    }
                } else {
                    if (features[1] <= 26.649999618530273) {
                        classes[0] = 6; 
                        classes[1] = 0; 
                    } else {
                        if (features[1] <= 39.099998474121094) {
                            if (features[0] <= 13.5) {
                                if (features[1] <= 29.850000381469727) {
                                    classes[0] = 0; 
                                    classes[1] = 6; 
                                } else {
                                    if (features[1] <= 30.650001525878906) {
                                        classes[0] = 3; 
                                        classes[1] = 0; 
                                    } else {
                                        if (features[0] <= 11.5) {
                                            if (features[2] <= 50.5) {
                                                classes[0] = 0; 
                                                classes[1] = 1; 
                                            } else {
                                                if (features[1] <= 37.79999923706055) {
                                                    classes[0] = 0; 
                                                    classes[1] = 3; 
                                                } else {
                                                    classes[0] = 1; 
                                                    classes[1] = 0; 
                                                }
                                            }
                                        } else {
                                            if (features[1] <= 32.0) {
                                                classes[0] = 0; 
                                                classes[1] = 2; 
                                            } else {
                                                classes[0] = 4; 
                                                classes[1] = 0; 
                                            }
                                        }
                                    }
                                }
                            } else {
                                classes[0] = 0; 
                                classes[1] = 2; 
                            }
                        } else {
                            if (features[0] <= 11.5) {
                                if (features[2] <= 41.0) {
                                    classes[0] = 0; 
                                    classes[1] = 3; 
                                } else {
                                    if (features[1] <= 44.25) {
                                        classes[0] = 0; 
                                        classes[1] = 1; 
                                    } else {
                                        if (features[1] <= 46.5) {
                                            classes[0] = 1; 
                                            classes[1] = 0; 
                                        } else {
                                            classes[0] = 0; 
                                            classes[1] = 1; 
                                        }
                                    }
                                }
                            } else {
                                classes[0] = 0; 
                                classes[1] = 6; 
                            }
                        }
                    }
                }
            }
        }
        int class_idx = 0;
        int class_val = classes[0];
        for (int i = 1; i < 2; i++) {
            if (classes[i] > class_val) {
                class_idx = i;
                class_val = classes[i];
            }
        }
        return class_idx;
    }
    
    public static int predict_1(double[] features) {
        int[] classes = new int[2];
        
        if (features[1] <= 27.849998474121094) {
            if (features[1] <= 24.75) {
                if (features[0] <= 7.5) {
                    if (features[2] <= 32.5) {
                        if (features[0] <= 2.5) {
                            classes[0] = 60; 
                            classes[1] = 0; 
                        } else {
                            if (features[0] <= 3.5) {
                                if (features[1] <= 23.0) {
                                    if (features[1] <= 22.75) {
                                        classes[0] = 5; 
                                        classes[1] = 0; 
                                    } else {
                                        classes[0] = 0; 
                                        classes[1] = 1; 
                                    }
                                } else {
                                    classes[0] = 7; 
                                    classes[1] = 0; 
                                }
                            } else {
                                classes[0] = 16; 
                                classes[1] = 0; 
                            }
                        }
                    } else {
                        if (features[2] <= 35.0) {
                            if (features[0] <= 2.5) {
                                classes[0] = 0; 
                                classes[1] = 1; 
                            } else {
                                classes[0] = 1; 
                                classes[1] = 0; 
                            }
                        } else {
                            if (features[1] <= 23.399999618530273) {
                                classes[0] = 10; 
                                classes[1] = 0; 
                            } else {
                                if (features[1] <= 23.850000381469727) {
                                    classes[0] = 0; 
                                    classes[1] = 1; 
                                } else {
                                    classes[0] = 1; 
                                    classes[1] = 0; 
                                }
                            }
                        }
                    }
                } else {
                    if (features[0] <= 8.5) {
                        if (features[1] <= 23.849998474121094) {
                            classes[0] = 0; 
                            classes[1] = 3; 
                        } else {
                            classes[0] = 2; 
                            classes[1] = 0; 
                        }
                    } else {
                        classes[0] = 8; 
                        classes[1] = 0; 
                    }
                }
            } else {
                if (features[2] <= 32.5) {
                    if (features[1] <= 26.299999237060547) {
                        classes[0] = 27; 
                        classes[1] = 0; 
                    } else {
                        if (features[2] <= 26.0) {
                            classes[0] = 23; 
                            classes[1] = 0; 
                        } else {
                            if (features[0] <= 3.5) {
                                if (features[2] <= 29.0) {
                                    if (features[2] <= 27.5) {
                                        if (features[0] <= 2.5) {
                                            classes[0] = 0; 
                                            classes[1] = 1; 
                                        } else {
                                            classes[0] = 1; 
                                            classes[1] = 0; 
                                        }
                                    } else {
                                        classes[0] = 0; 
                                        classes[1] = 2; 
                                    }
                                } else {
                                    classes[0] = 5; 
                                    classes[1] = 0; 
                                }
                            } else {
                                classes[0] = 7; 
                                classes[1] = 0; 
                            }
                        }
                    }
                } else {
                    if (features[1] <= 25.849998474121094) {
                        if (features[2] <= 42.0) {
                            classes[0] = 2; 
                            classes[1] = 0; 
                        } else {
                            if (features[2] <= 56.0) {
                                classes[0] = 0; 
                                classes[1] = 8; 
                            } else {
                                classes[0] = 1; 
                                classes[1] = 0; 
                            }
                        }
                    } else {
                        if (features[2] <= 35.0) {
                            classes[0] = 0; 
                            classes[1] = 3; 
                        } else {
                            if (features[2] <= 53.0) {
                                if (features[1] <= 26.600000381469727) {
                                    classes[0] = 4; 
                                    classes[1] = 0; 
                                } else {
                                    if (features[1] <= 27.549999237060547) {
                                        if (features[1] <= 27.25) {
                                            if (features[0] <= 6.0) {
                                                classes[0] = 0; 
                                                classes[1] = 1; 
                                            } else {
                                                classes[0] = 1; 
                                                classes[1] = 0; 
                                            }
                                        } else {
                                            classes[0] = 0; 
                                            classes[1] = 1; 
                                        }
                                    } else {
                                        if (features[2] <= 47.0) {
                                            classes[0] = 4; 
                                            classes[1] = 0; 
                                        } else {
                                            classes[0] = 0; 
                                            classes[1] = 2; 
                                        }
                                    }
                                }
                            } else {
                                classes[0] = 16; 
                                classes[1] = 0; 
                            }
                        }
                    }
                }
            }
        } else {
            if (features[0] <= 6.5) {
                if (features[2] <= 24.5) {
                    if (features[1] <= 31.100000381469727) {
                        classes[0] = 37; 
                        classes[1] = 0; 
                    } else {
                        if (features[2] <= 21.5) {
                            if (features[1] <= 41.400001525878906) {
                                if (features[0] <= 1.5) {
                                    if (features[0] <= 0.5) {
                                        if (features[1] <= 33.5) {
                                            classes[0] = 3; 
                                            classes[1] = 0; 
                                        } else {
                                            classes[0] = 0; 
                                            classes[1] = 3; 
                                        }
                                    } else {
                                        if (features[1] <= 35.849998474121094) {
                                            classes[0] = 0; 
                                            classes[1] = 2; 
                                        } else {
                                            classes[0] = 4; 
                                            classes[1] = 0; 
                                        }
                                    }
                                } else {
                                    classes[0] = 3; 
                                    classes[1] = 0; 
                                }
                            } else {
                                classes[0] = 0; 
                                classes[1] = 2; 
                            }
                        } else {
                            if (features[2] <= 22.5) {
                                if (features[0] <= 0.5) {
                                    if (features[1] <= 32.599998474121094) {
                                        classes[0] = 0; 
                                        classes[1] = 2; 
                                    } else {
                                        if (features[1] <= 33.400001525878906) {
                                            classes[0] = 3; 
                                            classes[1] = 0; 
                                        } else {
                                            if (features[1] <= 38.599998474121094) {
                                                classes[0] = 0; 
                                                classes[1] = 2; 
                                            } else {
                                                classes[0] = 1; 
                                                classes[1] = 0; 
                                            }
                                        }
                                    }
                                } else {
                                    if (features[1] <= 31.600000381469727) {
                                        classes[0] = 0; 
                                        classes[1] = 3; 
                                    } else {
                                        if (features[0] <= 3.5) {
                                            if (features[1] <= 38.599998474121094) {
                                                classes[0] = 10; 
                                                classes[1] = 0; 
                                            } else {
                                                if (features[0] <= 2.0) {
                                                    if (features[1] <= 41.20000076293945) {
                                                        classes[0] = 0; 
                                                        classes[1] = 1; 
                                                    } else {
                                                        classes[0] = 1; 
                                                        classes[1] = 0; 
                                                    }
                                                } else {
                                                    classes[0] = 3; 
                                                    classes[1] = 0; 
                                                }
                                            }
                                        } else {
                                            if (features[1] <= 38.54999923706055) {
                                                classes[0] = 4; 
                                                classes[1] = 0; 
                                            } else {
                                                classes[0] = 0; 
                                                classes[1] = 1; 
                                            }
                                        }
                                    }
                                }
                            } else {
                                if (features[2] <= 23.5) {
                                    if (features[1] <= 43.79999923706055) {
                                        if (features[0] <= 3.0) {
                                            classes[0] = 10; 
                                            classes[1] = 0; 
                                        } else {
                                            if (features[1] <= 32.849998474121094) {
                                                classes[0] = 1; 
                                                classes[1] = 0; 
                                            } else {
                                                classes[0] = 0; 
                                                classes[1] = 1; 
                                            }
                                        }
                                    } else {
                                        if (features[1] <= 48.19999694824219) {
                                            classes[0] = 0; 
                                            classes[1] = 1; 
                                        } else {
                                            classes[0] = 2; 
                                            classes[1] = 0; 
                                        }
                                    }
                                } else {
                                    if (features[0] <= 1.5) {
                                        if (features[0] <= 0.5) {
                                            if (features[1] <= 42.54999923706055) {
                                                classes[0] = 0; 
                                                classes[1] = 2; 
                                            } else {
                                                classes[0] = 4; 
                                                classes[1] = 0; 
                                            }
                                        } else {
                                            if (features[1] <= 39.04999923706055) {
                                                classes[0] = 3; 
                                                classes[1] = 0; 
                                            } else {
                                                classes[0] = 0; 
                                                classes[1] = 2; 
                                            }
                                        }
                                    } else {
                                        if (features[0] <= 2.5) {
                                            if (features[1] <= 42.25) {
                                                classes[0] = 6; 
                                                classes[1] = 0; 
                                            } else {
                                                classes[0] = 0; 
                                                classes[1] = 1; 
                                            }
                                        } else {
                                            classes[0] = 3; 
                                            classes[1] = 0; 
                                        }
                                    }
                                }
                            }
                        }
                    }
                } else {
                    if (features[1] <= 48.349998474121094) {
                        if (features[2] <= 49.5) {
                            if (features[2] <= 28.5) {
                                if (features[2] <= 25.5) {
                                    if (features[0] <= 2.5) {
                                        if (features[0] <= 0.5) {
                                            if (features[1] <= 40.95000076293945) {
                                                if (features[1] <= 36.69999694824219) {
                                                    if (features[1] <= 35.79999923706055) {
                                                        if (features[1] <= 32.900001525878906) {
                                                            classes[0] = 0; 
                                                            classes[1] = 1; 
                                                        } else {
                                                            classes[0] = 1; 
                                                            classes[1] = 0; 
                                                        }
                                                    } else {
                                                        classes[0] = 0; 
                                                        classes[1] = 3; 
                                                    }
                                                } else {
                                                    classes[0] = 3; 
                                                    classes[1] = 0; 
                                                }
                                            } else {
                                                classes[0] = 0; 
                                                classes[1] = 3; 
                                            }
                                        } else {
                                            if (features[1] <= 37.099998474121094) {
                                                classes[0] = 11; 
                                                classes[1] = 0; 
                                            } else {
                                                if (features[1] <= 39.599998474121094) {
                                                    classes[0] = 0; 
                                                    classes[1] = 1; 
                                                } else {
                                                    classes[0] = 1; 
                                                    classes[1] = 0; 
                                                }
                                            }
                                        }
                                    } else {
                                        if (features[0] <= 3.5) {
                                            if (features[1] <= 30.549999237060547) {
                                                classes[0] = 1; 
                                                classes[1] = 0; 
                                            } else {
                                                if (features[1] <= 33.400001525878906) {
                                                    if (features[1] <= 31.75) {
                                                        classes[0] = 0; 
                                                        classes[1] = 3; 
                                                    } else {
                                                        classes[0] = 1; 
                                                        classes[1] = 0; 
                                                    }
                                                } else {
                                                    classes[0] = 0; 
                                                    classes[1] = 6; 
                                                }
                                            }
                                        } else {
                                            if (features[0] <= 4.5) {
                                                classes[0] = 3; 
                                                classes[1] = 0; 
                                            } else {
                                                if (features[1] <= 34.75) {
                                                    if (features[1] <= 32.650001525878906) {
                                                        classes[0] = 0; 
                                                        classes[1] = 1; 
                                                    } else {
                                                        classes[0] = 3; 
                                                        classes[1] = 0; 
                                                    }
                                                } else {
                                                    classes[0] = 0; 
                                                    classes[1] = 2; 
                                                }
                                            }
                                        }
                                    }
                                } else {
                                    if (features[1] <= 37.80000305175781) {
                                        if (features[2] <= 27.5) {
                                            if (features[0] <= 2.5) {
                                                classes[0] = 17; 
                                                classes[1] = 0; 
                                            } else {
                                                if (features[2] <= 26.5) {
                                                    if (features[1] <= 31.75) {
                                                        if (features[1] <= 30.899999618530273) {
                                                            classes[0] = 1; 
                                                            classes[1] = 0; 
                                                        } else {
                                                            classes[0] = 0; 
                                                            classes[1] = 1; 
                                                        }
                                                    } else {
                                                        classes[0] = 6; 
                                                        classes[1] = 0; 
                                                    }
                                                } else {
                                                    if (features[0] <= 3.5) {
                                                        classes[0] = 0; 
                                                        classes[1] = 2; 
                                                    } else {
                                                        if (features[1] <= 30.599998474121094) {
                                                            classes[0] = 1; 
                                                            classes[1] = 0; 
                                                        } else {
                                                            if (features[1] <= 35.0) {
                                                                classes[0] = 0; 
                                                                classes[1] = 1; 
                                                            } else {
                                                                classes[0] = 1; 
                                                                classes[1] = 0; 
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        } else {
                                            if (features[1] <= 32.849998474121094) {
                                                classes[0] = 0; 
                                                classes[1] = 1; 
                                            } else {
                                                classes[0] = 13; 
                                                classes[1] = 0; 
                                            }
                                        }
                                    } else {
                                        if (features[2] <= 27.5) {
                                            if (features[0] <= 3.0) {
                                                if (features[2] <= 26.5) {
                                                    if (features[1] <= 41.900001525878906) {
                                                        classes[0] = 2; 
                                                        classes[1] = 0; 
                                                    } else {
                                                        if (features[1] <= 44.29999923706055) {
                                                            classes[0] = 0; 
                                                            classes[1] = 2; 
                                                        } else {
                                                            classes[0] = 2; 
                                                            classes[1] = 0; 
                                                        }
                                                    }
                                                } else {
                                                    classes[0] = 2; 
                                                    classes[1] = 0; 
                                                }
                                            } else {
                                                classes[0] = 0; 
                                                classes[1] = 3; 
                                            }
                                        } else {
                                            if (features[1] <= 39.599998474121094) {
                                                classes[0] = 0; 
                                                classes[1] = 2; 
                                            } else {
                                                if (features[1] <= 41.849998474121094) {
                                                    if (features[0] <= 0.5) {
                                                        classes[0] = 0; 
                                                        classes[1] = 2; 
                                                    } else {
                                                        classes[0] = 1; 
                                                        classes[1] = 0; 
                                                    }
                                                } else {
                                                    classes[0] = 0; 
                                                    classes[1] = 1; 
                                                }
                                            }
                                        }
                                    }
                                }
                            } else {
                                if (features[2] <= 47.5) {
                                    if (features[1] <= 30.049999237060547) {
                                        if (features[0] <= 3.5) {
                                            if (features[1] <= 28.200000762939453) {
                                                classes[0] = 0; 
                                                classes[1] = 1; 
                                            } else {
                                                if (features[1] <= 29.399999618530273) {
                                                    if (features[1] <= 28.849998474121094) {
                                                        classes[0] = 2; 
                                                        classes[1] = 0; 
                                                    } else {
                                                        classes[0] = 0; 
                                                        classes[1] = 1; 
                                                    }
                                                } else {
                                                    classes[0] = 7; 
                                                    classes[1] = 0; 
                                                }
                                            }
                                        } else {
                                            if (features[2] <= 40.5) {
                                                if (features[1] <= 29.75) {
                                                    if (features[0] <= 5.5) {
                                                        if (features[1] <= 28.200000762939453) {
                                                            classes[0] = 1; 
                                                            classes[1] = 0; 
                                                        } else {
                                                            if (features[2] <= 34.5) {
                                                                classes[0] = 0; 
                                                                classes[1] = 4; 
                                                            } else {
                                                                if (features[0] <= 4.5) {
                                                                    if (features[2] <= 36.5) {
                                                                        if (features[1] <= 29.049999237060547) {
                                                                            classes[0] = 0; 
                                                                            classes[1] = 1; 
                                                                        } else {
                                                                            classes[0] = 1; 
                                                                            classes[1] = 0; 
                                                                        }
                                                                    } else {
                                                                        classes[0] = 1; 
                                                                        classes[1] = 0; 
                                                                    }
                                                                } else {
                                                                    classes[0] = 1; 
                                                                    classes[1] = 0; 
                                                                }
                                                            }
                                                        }
                                                    } else {
                                                        classes[0] = 1; 
                                                        classes[1] = 0; 
                                                    }
                                                } else {
                                                    classes[0] = 6; 
                                                    classes[1] = 0; 
                                                }
                                            } else {
                                                classes[0] = 0; 
                                                classes[1] = 3; 
                                            }
                                        }
                                    } else {
                                        if (features[1] <= 46.25) {
                                            if (features[0] <= 3.5) {
                                                if (features[1] <= 37.44999694824219) {
                                                    if (features[2] <= 29.5) {
                                                        if (features[0] <= 1.0) {
                                                            classes[0] = 1; 
                                                            classes[1] = 0; 
                                                        } else {
                                                            classes[0] = 0; 
                                                            classes[1] = 1; 
                                                        }
                                                    } else {
                                                        if (features[2] <= 30.5) {
                                                            classes[0] = 0; 
                                                            classes[1] = 5; 
                                                        } else {
                                                            if (features[1] <= 33.94999694824219) {
                                                                if (features[2] <= 46.0) {
                                                                    if (features[0] <= 0.5) {
                                                                        classes[0] = 0; 
                                                                        classes[1] = 1; 
                                                                    } else {
                                                                        if (features[0] <= 2.5) {
                                                                            classes[0] = 4; 
                                                                            classes[1] = 0; 
                                                                        } else {
                                                                            if (features[2] <= 34.5) {
                                                                                classes[0] = 0; 
                                                                                classes[1] = 1; 
                                                                            } else {
                                                                                classes[0] = 2; 
                                                                                classes[1] = 0; 
                                                                            }
                                                                        }
                                                                    }
                                                                } else {
                                                                    classes[0] = 0; 
                                                                    classes[1] = 2; 
                                                                }
                                                            } else {
                                                                classes[0] = 0; 
                                                                classes[1] = 16; 
                                                            }
                                                        }
                                                    }
                                                } else {
                                                    if (features[0] <= 0.5) {
                                                        if (features[1] <= 44.75) {
                                                            if (features[2] <= 34.0) {
                                                                classes[0] = 0; 
                                                                classes[1] = 5; 
                                                            } else {
                                                                classes[0] = 2; 
                                                                classes[1] = 0; 
                                                            }
                                                        } else {
                                                            classes[0] = 1; 
                                                            classes[1] = 0; 
                                                        }
                                                    } else {
                                                        if (features[0] <= 1.5) {
                                                            if (features[1] <= 39.20000076293945) {
                                                                classes[0] = 3; 
                                                                classes[1] = 0; 
                                                            } else {
                                                                if (features[2] <= 35.0) {
                                                                    classes[0] = 3; 
                                                                    classes[1] = 0; 
                                                                } else {
                                                                    classes[0] = 0; 
                                                                    classes[1] = 3; 
                                                                }
                                                            }
                                                        } else {
                                                            if (features[1] <= 41.5) {
                                                                classes[0] = 3; 
                                                                classes[1] = 0; 
                                                            } else {
                                                                classes[0] = 0; 
                                                                classes[1] = 1; 
                                                            }
                                                        }
                                                    }
                                                }
                                            } else {
                                                if (features[1] <= 39.25) {
                                                    if (features[0] <= 5.5) {
                                                        if (features[2] <= 41.5) {
                                                            if (features[2] <= 36.0) {
                                                                if (features[2] <= 32.0) {
                                                                    if (features[1] <= 31.549999237060547) {
                                                                        classes[0] = 0; 
                                                                        classes[1] = 5; 
                                                                    } else {
                                                                        if (features[1] <= 37.29999923706055) {
                                                                            if (features[0] <= 4.5) {
                                                                                if (features[2] <= 30.0) {
                                                                                    classes[0] = 3; 
                                                                                    classes[1] = 0; 
                                                                                } else {
                                                                                    classes[0] = 0; 
                                                                                    classes[1] = 3; 
                                                                                }
                                                                            } else {
                                                                                classes[0] = 1; 
                                                                                classes[1] = 0; 
                                                                            }
                                                                        } else {
                                                                            classes[0] = 4; 
                                                                            classes[1] = 0; 
                                                                        }
                                                                    }
                                                                } else {
                                                                    if (features[2] <= 34.0) {
                                                                        classes[0] = 5; 
                                                                        classes[1] = 0; 
                                                                    } else {
                                                                        if (features[1] <= 35.400001525878906) {
                                                                            classes[0] = 0; 
                                                                            classes[1] = 2; 
                                                                        } else {
                                                                            classes[0] = 2; 
                                                                            classes[1] = 0; 
                                                                        }
                                                                    }
                                                                }
                                                            } else {
                                                                if (features[2] <= 37.5) {
                                                                    classes[0] = 0; 
                                                                    classes[1] = 1; 
                                                                } else {
                                                                    if (features[2] <= 39.5) {
                                                                        if (features[1] <= 34.04999923706055) {
                                                                            classes[0] = 0; 
                                                                            classes[1] = 1; 
                                                                        } else {
                                                                            classes[0] = 1; 
                                                                            classes[1] = 0; 
                                                                        }
                                                                    } else {
                                                                        classes[0] = 0; 
                                                                        classes[1] = 1; 
                                                                    }
                                                                }
                                                            }
                                                        } else {
                                                            if (features[1] <= 32.400001525878906) {
                                                                classes[0] = 0; 
                                                                classes[1] = 1; 
                                                            } else {
                                                                classes[0] = 5; 
                                                                classes[1] = 0; 
                                                            }
                                                        }
                                                    } else {
                                                        if (features[2] <= 34.0) {
                                                            if (features[2] <= 30.0) {
                                                                classes[0] = 0; 
                                                                classes[1] = 1; 
                                                            } else {
                                                                if (features[1] <= 33.849998474121094) {
                                                                    classes[0] = 0; 
                                                                    classes[1] = 1; 
                                                                } else {
                                                                    classes[0] = 1; 
                                                                    classes[1] = 0; 
                                                                }
                                                            }
                                                        } else {
                                                            classes[0] = 8; 
                                                            classes[1] = 0; 
                                                        }
                                                    }
                                                } else {
                                                    if (features[0] <= 5.5) {
                                                        if (features[2] <= 37.5) {
                                                            classes[0] = 0; 
                                                            classes[1] = 6; 
                                                        } else {
                                                            classes[0] = 2; 
                                                            classes[1] = 0; 
                                                        }
                                                    } else {
                                                        classes[0] = 0; 
                                                        classes[1] = 1; 
                                                    }
                                                }
                                            }
                                        } else {
                                            classes[0] = 2; 
                                            classes[1] = 0; 
                                        }
                                    }
                                } else {
                                    classes[0] = 3; 
                                    classes[1] = 0; 
                                }
                            }
                        } else {
                            if (features[2] <= 62.5) {
                                if (features[1] <= 41.400001525878906) {
                                    classes[0] = 0; 
                                    classes[1] = 17; 
                                } else {
                                    classes[0] = 2; 
                                    classes[1] = 0; 
                                }
                            } else {
                                if (features[0] <= 5.5) {
                                    if (features[2] <= 66.0) {
                                        classes[0] = 5; 
                                        classes[1] = 0; 
                                    } else {
                                        classes[0] = 0; 
                                        classes[1] = 1; 
                                    }
                                } else {
                                    classes[0] = 0; 
                                    classes[1] = 2; 
                                }
                            }
                        }
                    } else {
                        classes[0] = 0; 
                        classes[1] = 12; 
                    }
                }
            } else {
                if (features[2] <= 38.5) {
                    if (features[2] <= 35.0) {
                        if (features[0] <= 9.5) {
                            classes[0] = 0; 
                            classes[1] = 15; 
                        } else {
                            if (features[1] <= 36.650001525878906) {
                                classes[0] = 1; 
                                classes[1] = 0; 
                            } else {
                                classes[0] = 0; 
                                classes[1] = 2; 
                            }
                        }
                    } else {
                        if (features[0] <= 7.5) {
                            classes[0] = 2; 
                            classes[1] = 0; 
                        } else {
                            if (features[0] <= 9.5) {
                                classes[0] = 0; 
                                classes[1] = 6; 
                            } else {
                                if (features[0] <= 11.0) {
                                    if (features[1] <= 37.25) {
                                        classes[0] = 1; 
                                        classes[1] = 0; 
                                    } else {
                                        classes[0] = 0; 
                                        classes[1] = 1; 
                                    }
                                } else {
                                    classes[0] = 0; 
                                    classes[1] = 3; 
                                }
                            }
                        }
                    }
                } else {
                    if (features[2] <= 42.5) {
                        if (features[1] <= 31.150001525878906) {
                            classes[0] = 0; 
                            classes[1] = 5; 
                        } else {
                            if (features[0] <= 11.0) {
                                if (features[0] <= 7.5) {
                                    if (features[1] <= 35.099998474121094) {
                                        if (features[2] <= 41.5) {
                                            classes[0] = 8; 
                                            classes[1] = 0; 
                                        } else {
                                            if (features[1] <= 33.75) {
                                                classes[0] = 0; 
                                                classes[1] = 1; 
                                            } else {
                                                classes[0] = 2; 
                                                classes[1] = 0; 
                                            }
                                        }
                                    } else {
                                        classes[0] = 0; 
                                        classes[1] = 7; 
                                    }
                                } else {
                                    if (features[0] <= 8.5) {
                                        if (features[1] <= 36.599998474121094) {
                                            if (features[2] <= 41.5) {
                                                classes[0] = 0; 
                                                classes[1] = 1; 
                                            } else {
                                                classes[0] = 2; 
                                                classes[1] = 0; 
                                            }
                                        } else {
                                            classes[0] = 5; 
                                            classes[1] = 0; 
                                        }
                                    } else {
                                        if (features[1] <= 31.80000114440918) {
                                            classes[0] = 5; 
                                            classes[1] = 0; 
                                        } else {
                                            if (features[1] <= 32.75) {
                                                classes[0] = 0; 
                                                classes[1] = 2; 
                                            } else {
                                                if (features[2] <= 41.0) {
                                                    if (features[0] <= 9.5) {
                                                        if (features[1] <= 35.5) {
                                                            classes[0] = 2; 
                                                            classes[1] = 0; 
                                                        } else {
                                                            classes[0] = 0; 
                                                            classes[1] = 2; 
                                                        }
                                                    } else {
                                                        classes[0] = 1; 
                                                        classes[1] = 0; 
                                                    }
                                                } else {
                                                    classes[0] = 0; 
                                                    classes[1] = 2; 
                                                }
                                            }
                                        }
                                    }
                                }
                            } else {
                                classes[0] = 3; 
                                classes[1] = 0; 
                            }
                        }
                    } else {
                        if (features[0] <= 10.5) {
                            if (features[2] <= 44.0) {
                                classes[0] = 0; 
                                classes[1] = 7; 
                            } else {
                                if (features[1] <= 35.349998474121094) {
                                    if (features[2] <= 45.5) {
                                        if (features[1] <= 31.799999237060547) {
                                            classes[0] = 2; 
                                            classes[1] = 0; 
                                        } else {
                                            classes[0] = 0; 
                                            classes[1] = 3; 
                                        }
                                    } else {
                                        classes[0] = 0; 
                                        classes[1] = 12; 
                                    }
                                } else {
                                    if (features[1] <= 37.19999694824219) {
                                        classes[0] = 4; 
                                        classes[1] = 0; 
                                    } else {
                                        if (features[2] <= 50.0) {
                                            classes[0] = 1; 
                                            classes[1] = 0; 
                                        } else {
                                            if (features[0] <= 8.5) {
                                                classes[0] = 2; 
                                                classes[1] = 0; 
                                            } else {
                                                classes[0] = 0; 
                                                classes[1] = 1; 
                                            }
                                        }
                                    }
                                }
                            }
                        } else {
                            if (features[1] <= 39.099998474121094) {
                                if (features[1] <= 33.75) {
                                    classes[0] = 0; 
                                    classes[1] = 5; 
                                } else {
                                    if (features[0] <= 11.5) {
                                        if (features[2] <= 50.5) {
                                            classes[0] = 0; 
                                            classes[1] = 2; 
                                        } else {
                                            if (features[1] <= 37.79999923706055) {
                                                classes[0] = 0; 
                                                classes[1] = 2; 
                                            } else {
                                                classes[0] = 1; 
                                                classes[1] = 0; 
                                            }
                                        }
                                    } else {
                                        classes[0] = 4; 
                                        classes[1] = 0; 
                                    }
                                }
                            } else {
                                classes[0] = 0; 
                                classes[1] = 9; 
                            }
                        }
                    }
                }
            }
        }
        int class_idx = 0;
        int class_val = classes[0];
        for (int i = 1; i < 2; i++) {
            if (classes[i] > class_val) {
                class_idx = i;
                class_val = classes[i];
            }
        }
        return class_idx;
    }
    
    public static int predict_2(double[] features) {
        int[] classes = new int[2];
        
        if (features[0] <= 6.5) {
            if (features[0] <= 2.5) {
                if (features[2] <= 27.5) {
                    if (features[0] <= 0.5) {
                        if (features[2] <= 25.5) {
                            if (features[1] <= 33.25) {
                                if (features[2] <= 23.0) {
                                    classes[0] = 17; 
                                    classes[1] = 0; 
                                } else {
                                    if (features[2] <= 24.5) {
                                        if (features[1] <= 31.55000114440918) {
                                            classes[0] = 1; 
                                            classes[1] = 0; 
                                        } else {
                                            classes[0] = 0; 
                                            classes[1] = 1; 
                                        }
                                    } else {
                                        classes[0] = 2; 
                                        classes[1] = 0; 
                                    }
                                }
                            } else {
                                if (features[2] <= 23.5) {
                                    if (features[2] <= 21.5) {
                                        if (features[1] <= 42.79999923706055) {
                                            if (features[1] <= 39.5) {
                                                if (features[1] <= 35.19999694824219) {
                                                    classes[0] = 0; 
                                                    classes[1] = 2; 
                                                } else {
                                                    classes[0] = 2; 
                                                    classes[1] = 0; 
                                                }
                                            } else {
                                                classes[0] = 0; 
                                                classes[1] = 3; 
                                            }
                                        } else {
                                            classes[0] = 2; 
                                            classes[1] = 0; 
                                        }
                                    } else {
                                        if (features[2] <= 22.5) {
                                            if (features[1] <= 38.29999923706055) {
                                                classes[0] = 0; 
                                                classes[1] = 5; 
                                            } else {
                                                classes[0] = 2; 
                                                classes[1] = 0; 
                                            }
                                        } else {
                                            if (features[1] <= 34.79999923706055) {
                                                classes[0] = 0; 
                                                classes[1] = 2; 
                                            } else {
                                                classes[0] = 1; 
                                                classes[1] = 0; 
                                            }
                                        }
                                    }
                                } else {
                                    if (features[1] <= 49.25) {
                                        if (features[1] <= 43.900001525878906) {
                                            if (features[2] <= 24.5) {
                                                if (features[1] <= 35.95000076293945) {
                                                    classes[0] = 1; 
                                                    classes[1] = 0; 
                                                } else {
                                                    classes[0] = 0; 
                                                    classes[1] = 3; 
                                                }
                                            } else {
                                                if (features[1] <= 36.19999694824219) {
                                                    classes[0] = 1; 
                                                    classes[1] = 0; 
                                                } else {
                                                    if (features[1] <= 38.25) {
                                                        classes[0] = 0; 
                                                        classes[1] = 2; 
                                                    } else {
                                                        classes[0] = 1; 
                                                        classes[1] = 0; 
                                                    }
                                                }
                                            }
                                        } else {
                                            classes[0] = 6; 
                                            classes[1] = 0; 
                                        }
                                    } else {
                                        classes[0] = 0; 
                                        classes[1] = 2; 
                                    }
                                }
                            }
                        } else {
                            if (features[2] <= 26.5) {
                                if (features[1] <= 57.5) {
                                    if (features[1] <= 41.900001525878906) {
                                        classes[0] = 6; 
                                        classes[1] = 0; 
                                    } else {
                                        if (features[1] <= 45.55000305175781) {
                                            classes[0] = 0; 
                                            classes[1] = 1; 
                                        } else {
                                            classes[0] = 3; 
                                            classes[1] = 0; 
                                        }
                                    }
                                } else {
                                    classes[0] = 0; 
                                    classes[1] = 1; 
                                }
                            } else {
                                classes[0] = 2; 
                                classes[1] = 0; 
                            }
                        }
                    } else {
                        if (features[1] <= 42.5) {
                            if (features[1] <= 37.900001525878906) {
                                if (features[0] <= 1.5) {
                                    classes[0] = 68; 
                                    classes[1] = 0; 
                                } else {
                                    if (features[1] <= 28.799999237060547) {
                                        classes[0] = 37; 
                                        classes[1] = 0; 
                                    } else {
                                        if (features[1] <= 28.950000762939453) {
                                            classes[0] = 0; 
                                            classes[1] = 1; 
                                        } else {
                                            if (features[1] <= 31.900001525878906) {
                                                if (features[2] <= 24.5) {
                                                    classes[0] = 15; 
                                                    classes[1] = 0; 
                                                } else {
                                                    if (features[1] <= 30.850000381469727) {
                                                        classes[0] = 3; 
                                                        classes[1] = 0; 
                                                    } else {
                                                        classes[0] = 0; 
                                                        classes[1] = 2; 
                                                    }
                                                }
                                            } else {
                                                classes[0] = 18; 
                                                classes[1] = 0; 
                                            }
                                        }
                                    }
                                }
                            } else {
                                if (features[2] <= 22.0) {
                                    classes[0] = 3; 
                                    classes[1] = 0; 
                                } else {
                                    if (features[1] <= 38.900001525878906) {
                                        classes[0] = 0; 
                                        classes[1] = 4; 
                                    } else {
                                        classes[0] = 9; 
                                        classes[1] = 0; 
                                    }
                                }
                            }
                        } else {
                            if (features[0] <= 1.5) {
                                if (features[1] <= 46.400001525878906) {
                                    if (features[1] <= 43.20000076293945) {
                                        classes[0] = 0; 
                                        classes[1] = 2; 
                                    } else {
                                        classes[0] = 1; 
                                        classes[1] = 0; 
                                    }
                                } else {
                                    classes[0] = 0; 
                                    classes[1] = 4; 
                                }
                            } else {
                                classes[0] = 0; 
                                classes[1] = 2; 
                            }
                        }
                    }
                } else {
                    if (features[1] <= 27.349998474121094) {
                        classes[0] = 19; 
                        classes[1] = 0; 
                    } else {
                        if (features[1] <= 27.649999618530273) {
                            classes[0] = 0; 
                            classes[1] = 3; 
                        } else {
                            if (features[1] <= 48.25) {
                                if (features[1] <= 36.849998474121094) {
                                    if (features[1] <= 30.100000381469727) {
                                        if (features[2] <= 36.0) {
                                            if (features[1] <= 28.149999618530273) {
                                                if (features[0] <= 1.5) {
                                                    classes[0] = 2; 
                                                    classes[1] = 0; 
                                                } else {
                                                    classes[0] = 0; 
                                                    classes[1] = 1; 
                                                }
                                            } else {
                                                classes[0] = 5; 
                                                classes[1] = 0; 
                                            }
                                        } else {
                                            if (features[1] <= 29.450000762939453) {
                                                classes[0] = 0; 
                                                classes[1] = 2; 
                                            } else {
                                                classes[0] = 1; 
                                                classes[1] = 0; 
                                            }
                                        }
                                    } else {
                                        if (features[1] <= 31.799999237060547) {
                                            classes[0] = 0; 
                                            classes[1] = 4; 
                                        } else {
                                            if (features[0] <= 1.5) {
                                                if (features[0] <= 0.5) {
                                                    if (features[1] <= 33.04999923706055) {
                                                        classes[0] = 0; 
                                                        classes[1] = 2; 
                                                    } else {
                                                        if (features[2] <= 31.0) {
                                                            classes[0] = 2; 
                                                            classes[1] = 0; 
                                                        } else {
                                                            if (features[1] <= 34.04999923706055) {
                                                                classes[0] = 2; 
                                                                classes[1] = 0; 
                                                            } else {
                                                                classes[0] = 0; 
                                                                classes[1] = 2; 
                                                            }
                                                        }
                                                    }
                                                } else {
                                                    if (features[1] <= 33.04999923706055) {
                                                        if (features[1] <= 32.400001525878906) {
                                                            classes[0] = 3; 
                                                            classes[1] = 0; 
                                                        } else {
                                                            if (features[2] <= 47.5) {
                                                                classes[0] = 1; 
                                                                classes[1] = 3; 
                                                            } else {
                                                                classes[0] = 2; 
                                                                classes[1] = 0; 
                                                            }
                                                        }
                                                    } else {
                                                        classes[0] = 0; 
                                                        classes[1] = 9; 
                                                    }
                                                }
                                            } else {
                                                if (features[1] <= 33.20000076293945) {
                                                    classes[0] = 0; 
                                                    classes[1] = 2; 
                                                } else {
                                                    if (features[2] <= 28.5) {
                                                        classes[0] = 2; 
                                                        classes[1] = 0; 
                                                    } else {
                                                        if (features[2] <= 35.5) {
                                                            classes[0] = 0; 
                                                            classes[1] = 1; 
                                                        } else {
                                                            classes[0] = 2; 
                                                            classes[1] = 0; 
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                } else {
                                    if (features[0] <= 1.5) {
                                        if (features[0] <= 0.5) {
                                            if (features[1] <= 42.900001525878906) {
                                                if (features[1] <= 39.20000076293945) {
                                                    classes[0] = 0; 
                                                    classes[1] = 3; 
                                                } else {
                                                    if (features[2] <= 36.5) {
                                                        classes[0] = 0; 
                                                        classes[1] = 3; 
                                                    } else {
                                                        classes[0] = 2; 
                                                        classes[1] = 0; 
                                                    }
                                                }
                                            } else {
                                                if (features[2] <= 33.0) {
                                                    if (features[1] <= 46.29999923706055) {
                                                        classes[0] = 0; 
                                                        classes[1] = 1; 
                                                    } else {
                                                        classes[0] = 1; 
                                                        classes[1] = 0; 
                                                    }
                                                } else {
                                                    classes[0] = 4; 
                                                    classes[1] = 0; 
                                                }
                                            }
                                        } else {
                                            if (features[1] <= 38.95000076293945) {
                                                classes[0] = 9; 
                                                classes[1] = 0; 
                                            } else {
                                                if (features[2] <= 32.5) {
                                                    if (features[1] <= 41.849998474121094) {
                                                        classes[0] = 3; 
                                                        classes[1] = 0; 
                                                    } else {
                                                        if (features[1] <= 45.94999694824219) {
                                                            classes[0] = 0; 
                                                            classes[1] = 2; 
                                                        } else {
                                                            classes[0] = 1; 
                                                            classes[1] = 0; 
                                                        }
                                                    }
                                                } else {
                                                    classes[0] = 0; 
                                                    classes[1] = 5; 
                                                }
                                            }
                                        }
                                    } else {
                                        if (features[1] <= 43.0) {
                                            classes[0] = 6; 
                                            classes[1] = 0; 
                                        } else {
                                            classes[0] = 0; 
                                            classes[1] = 1; 
                                        }
                                    }
                                }
                            } else {
                                classes[0] = 0; 
                                classes[1] = 2; 
                            }
                        }
                    }
                }
            } else {
                if (features[1] <= 43.150001525878906) {
                    if (features[0] <= 3.5) {
                        if (features[1] <= 34.650001525878906) {
                            if (features[2] <= 26.5) {
                                if (features[2] <= 22.5) {
                                    classes[0] = 8; 
                                    classes[1] = 0; 
                                } else {
                                    if (features[2] <= 23.5) {
                                        if (features[1] <= 26.299999237060547) {
                                            classes[0] = 0; 
                                            classes[1] = 1; 
                                        } else {
                                            classes[0] = 1; 
                                            classes[1] = 0; 
                                        }
                                    } else {
                                        if (features[2] <= 25.5) {
                                            if (features[2] <= 24.5) {
                                                classes[0] = 2; 
                                                classes[1] = 0; 
                                            } else {
                                                if (features[1] <= 30.549999237060547) {
                                                    classes[0] = 3; 
                                                    classes[1] = 0; 
                                                } else {
                                                    if (features[1] <= 32.95000076293945) {
                                                        classes[0] = 0; 
                                                        classes[1] = 1; 
                                                    } else {
                                                        classes[0] = 2; 
                                                        classes[1] = 0; 
                                                    }
                                                }
                                            }
                                        } else {
                                            classes[0] = 5; 
                                            classes[1] = 0; 
                                        }
                                    }
                                }
                            } else {
                                if (features[2] <= 35.5) {
                                    if (features[1] <= 30.299999237060547) {
                                        if (features[2] <= 33.0) {
                                            if (features[2] <= 29.0) {
                                                if (features[2] <= 27.5) {
                                                    if (features[1] <= 28.799999237060547) {
                                                        classes[0] = 3; 
                                                        classes[1] = 0; 
                                                    } else {
                                                        classes[0] = 0; 
                                                        classes[1] = 2; 
                                                    }
                                                } else {
                                                    classes[0] = 0; 
                                                    classes[1] = 2; 
                                                }
                                            } else {
                                                if (features[2] <= 30.5) {
                                                    classes[0] = 2; 
                                                    classes[1] = 0; 
                                                } else {
                                                    if (features[2] <= 31.5) {
                                                        classes[0] = 0; 
                                                        classes[1] = 1; 
                                                    } else {
                                                        classes[0] = 1; 
                                                        classes[1] = 0; 
                                                    }
                                                }
                                            }
                                        } else {
                                            classes[0] = 0; 
                                            classes[1] = 1; 
                                        }
                                    } else {
                                        if (features[2] <= 27.5) {
                                            classes[0] = 0; 
                                            classes[1] = 1; 
                                        } else {
                                            if (features[1] <= 31.049999237060547) {
                                                classes[0] = 0; 
                                                classes[1] = 1; 
                                            } else {
                                                classes[0] = 1; 
                                                classes[1] = 3; 
                                            }
                                        }
                                    }
                                } else {
                                    classes[0] = 12; 
                                    classes[1] = 0; 
                                }
                            }
                        } else {
                            if (features[1] <= 36.80000305175781) {
                                classes[0] = 0; 
                                classes[1] = 9; 
                            } else {
                                if (features[1] <= 37.25) {
                                    if (features[2] <= 26.0) {
                                        classes[0] = 0; 
                                        classes[1] = 1; 
                                    } else {
                                        classes[0] = 1; 
                                        classes[1] = 0; 
                                    }
                                } else {
                                    classes[0] = 4; 
                                    classes[1] = 0; 
                                }
                            }
                        }
                    } else {
                        if (features[1] <= 33.0) {
                            if (features[0] <= 5.5) {
                                if (features[1] <= 30.549999237060547) {
                                    if (features[2] <= 32.5) {
                                        classes[0] = 22; 
                                        classes[1] = 0; 
                                    } else {
                                        if (features[2] <= 54.0) {
                                            if (features[2] <= 49.5) {
                                                if (features[2] <= 47.0) {
                                                    if (features[2] <= 43.0) {
                                                        if (features[0] <= 4.5) {
                                                            if (features[1] <= 29.650001525878906) {
                                                                if (features[1] <= 28.450000762939453) {
                                                                    if (features[1] <= 26.200000762939453) {
                                                                        classes[0] = 1; 
                                                                        classes[1] = 0; 
                                                                    } else {
                                                                        classes[0] = 0; 
                                                                        classes[1] = 2; 
                                                                    }
                                                                } else {
                                                                    classes[0] = 3; 
                                                                    classes[1] = 0; 
                                                                }
                                                            } else {
                                                                classes[0] = 0; 
                                                                classes[1] = 1; 
                                                            }
                                                        } else {
                                                            classes[0] = 2; 
                                                            classes[1] = 0; 
                                                        }
                                                    } else {
                                                        classes[0] = 0; 
                                                        classes[1] = 3; 
                                                    }
                                                } else {
                                                    classes[0] = 2; 
                                                    classes[1] = 0; 
                                                }
                                            } else {
                                                classes[0] = 0; 
                                                classes[1] = 2; 
                                            }
                                        } else {
                                            classes[0] = 7; 
                                            classes[1] = 0; 
                                        }
                                    }
                                } else {
                                    if (features[1] <= 31.25) {
                                        classes[0] = 0; 
                                        classes[1] = 5; 
                                    } else {
                                        if (features[0] <= 4.5) {
                                            if (features[1] <= 32.849998474121094) {
                                                if (features[1] <= 32.54999923706055) {
                                                    if (features[2] <= 25.5) {
                                                        classes[0] = 2; 
                                                        classes[1] = 0; 
                                                    } else {
                                                        if (features[1] <= 31.950000762939453) {
                                                            classes[0] = 2; 
                                                            classes[1] = 0; 
                                                        } else {
                                                            if (features[1] <= 32.150001525878906) {
                                                                if (features[2] <= 32.5) {
                                                                    classes[0] = 0; 
                                                                    classes[1] = 1; 
                                                                } else {
                                                                    if (features[2] <= 34.5) {
                                                                        classes[0] = 1; 
                                                                        classes[1] = 0; 
                                                                    } else {
                                                                        classes[0] = 0; 
                                                                        classes[1] = 1; 
                                                                    }
                                                                }
                                                            } else {
                                                                classes[0] = 0; 
                                                                classes[1] = 2; 
                                                            }
                                                        }
                                                    }
                                                } else {
                                                    classes[0] = 3; 
                                                    classes[1] = 0; 
                                                }
                                            } else {
                                                classes[0] = 0; 
                                                classes[1] = 3; 
                                            }
                                        } else {
                                            classes[0] = 0; 
                                            classes[1] = 4; 
                                        }
                                    }
                                }
                            } else {
                                if (features[2] <= 32.5) {
                                    if (features[2] <= 28.5) {
                                        classes[0] = 7; 
                                        classes[1] = 0; 
                                    } else {
                                        if (features[2] <= 31.5) {
                                            if (features[1] <= 25.950000762939453) {
                                                classes[0] = 1; 
                                                classes[1] = 0; 
                                            } else {
                                                classes[0] = 0; 
                                                classes[1] = 2; 
                                            }
                                        } else {
                                            classes[0] = 7; 
                                            classes[1] = 0; 
                                        }
                                    }
                                } else {
                                    if (features[1] <= 21.549999237060547) {
                                        classes[0] = 2; 
                                        classes[1] = 0; 
                                    } else {
                                        if (features[1] <= 23.850000381469727) {
                                            classes[0] = 0; 
                                            classes[1] = 4; 
                                        } else {
                                            if (features[2] <= 52.5) {
                                                if (features[2] <= 36.5) {
                                                    classes[0] = 0; 
                                                    classes[1] = 4; 
                                                } else {
                                                    if (features[2] <= 39.0) {
                                                        classes[0] = 1; 
                                                        classes[1] = 0; 
                                                    } else {
                                                        if (features[1] <= 27.850000381469727) {
                                                            if (features[1] <= 25.25) {
                                                                classes[0] = 0; 
                                                                classes[1] = 1; 
                                                            } else {
                                                                classes[0] = 1; 
                                                                classes[1] = 0; 
                                                            }
                                                        } else {
                                                            classes[0] = 0; 
                                                            classes[1] = 5; 
                                                        }
                                                    }
                                                }
                                            } else {
                                                classes[0] = 3; 
                                                classes[1] = 0; 
                                            }
                                        }
                                    }
                                }
                            }
                        } else {
                            if (features[1] <= 34.75) {
                                if (features[0] <= 4.5) {
                                    classes[0] = 13; 
                                    classes[1] = 0; 
                                } else {
                                    if (features[0] <= 5.5) {
                                        if (features[1] <= 33.849998474121094) {
                                            classes[0] = 6; 
                                            classes[1] = 0; 
                                        } else {
                                            if (features[2] <= 35.5) {
                                                classes[0] = 6; 
                                                classes[1] = 0; 
                                            } else {
                                                if (features[1] <= 34.04999923706055) {
                                                    classes[0] = 0; 
                                                    classes[1] = 1; 
                                                } else {
                                                    classes[0] = 1; 
                                                    classes[1] = 0; 
                                                }
                                            }
                                        }
                                    } else {
                                        classes[0] = 8; 
                                        classes[1] = 0; 
                                    }
                                }
                            } else {
                                if (features[2] <= 47.0) {
                                    if (features[0] <= 5.5) {
                                        if (features[2] <= 26.5) {
                                            if (features[1] <= 34.94999694824219) {
                                                classes[0] = 0; 
                                                classes[1] = 2; 
                                            } else {
                                                if (features[2] <= 24.0) {
                                                    classes[0] = 1; 
                                                    classes[1] = 0; 
                                                } else {
                                                    if (features[1] <= 37.650001525878906) {
                                                        classes[0] = 0; 
                                                        classes[1] = 1; 
                                                    } else {
                                                        classes[0] = 1; 
                                                        classes[1] = 0; 
                                                    }
                                                }
                                            }
                                        } else {
                                            if (features[1] <= 37.75) {
                                                if (features[0] <= 4.5) {
                                                    classes[0] = 7; 
                                                    classes[1] = 0; 
                                                } else {
                                                    if (features[1] <= 35.400001525878906) {
                                                        classes[0] = 0; 
                                                        classes[1] = 1; 
                                                    } else {
                                                        classes[0] = 8; 
                                                        classes[1] = 0; 
                                                    }
                                                }
                                            } else {
                                                if (features[1] <= 38.79999923706055) {
                                                    classes[0] = 0; 
                                                    classes[1] = 4; 
                                                } else {
                                                    if (features[1] <= 39.25) {
                                                        classes[0] = 3; 
                                                        classes[1] = 0; 
                                                    } else {
                                                        if (features[2] <= 33.5) {
                                                            classes[0] = 0; 
                                                            classes[1] = 2; 
                                                        } else {
                                                            classes[0] = 2; 
                                                            classes[1] = 0; 
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    } else {
                                        classes[0] = 5; 
                                        classes[1] = 0; 
                                    }
                                } else {
                                    classes[0] = 0; 
                                    classes[1] = 4; 
                                }
                            }
                        }
                    }
                } else {
                    if (features[0] <= 3.5) {
                        classes[0] = 1; 
                        classes[1] = 0; 
                    } else {
                        if (features[0] <= 5.5) {
                            if (features[1] <= 45.349998474121094) {
                                if (features[0] <= 4.5) {
                                    classes[0] = 0; 
                                    classes[1] = 3; 
                                } else {
                                    classes[0] = 1; 
                                    classes[1] = 0; 
                                }
                            } else {
                                classes[0] = 0; 
                                classes[1] = 5; 
                            }
                        } else {
                            if (features[1] <= 46.150001525878906) {
                                classes[0] = 1; 
                                classes[1] = 0; 
                            } else {
                                classes[0] = 0; 
                                classes[1] = 1; 
                            }
                        }
                    }
                }
            }
        } else {
            if (features[2] <= 56.5) {
                if (features[1] <= 37.650001525878906) {
                    if (features[0] <= 13.5) {
                        if (features[1] <= 33.0) {
                            if (features[1] <= 23.200000762939453) {
                                if (features[1] <= 10.399999618530273) {
                                    if (features[2] <= 39.0) {
                                        classes[0] = 1; 
                                        classes[1] = 0; 
                                    } else {
                                        classes[0] = 0; 
                                        classes[1] = 1; 
                                    }
                                } else {
                                    classes[0] = 4; 
                                    classes[1] = 0; 
                                }
                            } else {
                                if (features[2] <= 34.5) {
                                    if (features[0] <= 9.5) {
                                        classes[0] = 0; 
                                        classes[1] = 11; 
                                    } else {
                                        classes[0] = 2; 
                                        classes[1] = 0; 
                                    }
                                } else {
                                    if (features[1] <= 30.200000762939453) {
                                        if (features[1] <= 29.799999237060547) {
                                            if (features[0] <= 8.0) {
                                                if (features[1] <= 25.150001525878906) {
                                                    classes[0] = 0; 
                                                    classes[1] = 1; 
                                                } else {
                                                    classes[0] = 4; 
                                                    classes[1] = 0; 
                                                }
                                            } else {
                                                if (features[2] <= 45.5) {
                                                    if (features[0] <= 10.5) {
                                                        classes[0] = 4; 
                                                        classes[1] = 0; 
                                                    } else {
                                                        if (features[2] <= 43.0) {
                                                            classes[0] = 0; 
                                                            classes[1] = 2; 
                                                        } else {
                                                            classes[0] = 1; 
                                                            classes[1] = 0; 
                                                        }
                                                    }
                                                } else {
                                                    classes[0] = 0; 
                                                    classes[1] = 8; 
                                                }
                                            }
                                        } else {
                                            if (features[0] <= 10.0) {
                                                if (features[0] <= 8.0) {
                                                    classes[0] = 1; 
                                                    classes[1] = 0; 
                                                } else {
                                                    classes[0] = 0; 
                                                    classes[1] = 1; 
                                                }
                                            } else {
                                                classes[0] = 4; 
                                                classes[1] = 0; 
                                            }
                                        }
                                    } else {
                                        if (features[0] <= 8.5) {
                                            if (features[2] <= 38.5) {
                                                classes[0] = 0; 
                                                classes[1] = 4; 
                                            } else {
                                                if (features[1] <= 31.5) {
                                                    classes[0] = 0; 
                                                    classes[1] = 3; 
                                                } else {
                                                    if (features[2] <= 41.5) {
                                                        classes[0] = 1; 
                                                        classes[1] = 0; 
                                                    } else {
                                                        classes[0] = 0; 
                                                        classes[1] = 1; 
                                                    }
                                                }
                                            }
                                        } else {
                                            if (features[1] <= 30.599998474121094) {
                                                classes[0] = 0; 
                                                classes[1] = 1; 
                                            } else {
                                                if (features[1] <= 31.900001525878906) {
                                                    classes[0] = 1; 
                                                    classes[1] = 0; 
                                                } else {
                                                    classes[0] = 0; 
                                                    classes[1] = 1; 
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        } else {
                            if (features[2] <= 50.5) {
                                if (features[1] <= 33.650001525878906) {
                                    classes[0] = 7; 
                                    classes[1] = 0; 
                                } else {
                                    if (features[1] <= 34.45000076293945) {
                                        classes[0] = 0; 
                                        classes[1] = 4; 
                                    } else {
                                        if (features[0] <= 8.5) {
                                            if (features[1] <= 37.400001525878906) {
                                                if (features[0] <= 7.5) {
                                                    if (features[2] <= 41.5) {
                                                        classes[0] = 0; 
                                                        classes[1] = 1; 
                                                    } else {
                                                        classes[0] = 5; 
                                                        classes[1] = 0; 
                                                    }
                                                } else {
                                                    if (features[2] <= 45.5) {
                                                        classes[0] = 0; 
                                                        classes[1] = 1; 
                                                    } else {
                                                        classes[0] = 1; 
                                                        classes[1] = 0; 
                                                    }
                                                }
                                            } else {
                                                classes[0] = 0; 
                                                classes[1] = 1; 
                                            }
                                        } else {
                                            classes[0] = 7; 
                                            classes[1] = 0; 
                                        }
                                    }
                                }
                            } else {
                                if (features[1] <= 37.099998474121094) {
                                    classes[0] = 0; 
                                    classes[1] = 4; 
                                } else {
                                    if (features[0] <= 8.5) {
                                        classes[0] = 4; 
                                        classes[1] = 0; 
                                    } else {
                                        classes[0] = 0; 
                                        classes[1] = 4; 
                                    }
                                }
                            }
                        }
                    } else {
                        classes[0] = 0; 
                        classes[1] = 6; 
                    }
                } else {
                    if (features[0] <= 11.5) {
                        if (features[1] <= 40.55000305175781) {
                            if (features[1] <= 40.05000305175781) {
                                if (features[1] <= 38.599998474121094) {
                                    classes[0] = 0; 
                                    classes[1] = 7; 
                                } else {
                                    if (features[0] <= 7.5) {
                                        classes[0] = 0; 
                                        classes[1] = 5; 
                                    } else {
                                        classes[0] = 2; 
                                        classes[1] = 0; 
                                    }
                                }
                            } else {
                                classes[0] = 1; 
                                classes[1] = 0; 
                            }
                        } else {
                            classes[0] = 0; 
                            classes[1] = 15; 
                        }
                    } else {
                        classes[0] = 0; 
                        classes[1] = 5; 
                    }
                }
            } else {
                if (features[2] <= 59.0) {
                    if (features[1] <= 30.75) {
                        classes[0] = 7; 
                        classes[1] = 0; 
                    } else {
                        if (features[1] <= 35.25) {
                            classes[0] = 0; 
                            classes[1] = 1; 
                        } else {
                            if (features[2] <= 57.5) {
                                classes[0] = 1; 
                                classes[1] = 0; 
                            } else {
                                classes[0] = 0; 
                                classes[1] = 1; 
                            }
                        }
                    }
                } else {
                    classes[0] = 7; 
                    classes[1] = 0; 
                }
            }
        }
        int class_idx = 0;
        int class_val = classes[0];
        for (int i = 1; i < 2; i++) {
            if (classes[i] > class_val) {
                class_idx = i;
                class_val = classes[i];
            }
        }
        return class_idx;
    }
    
    public static int predict_3(double[] features) {
        int[] classes = new int[2];
        
        if (features[1] <= 27.849998474121094) {
            if (features[0] <= 3.5) {
                if (features[2] <= 26.5) {
                    if (features[0] <= 2.5) {
                        classes[0] = 102; 
                        classes[1] = 0; 
                    } else {
                        if (features[2] <= 22.5) {
                            if (features[2] <= 21.5) {
                                classes[0] = 1; 
                                classes[1] = 0; 
                            } else {
                                if (features[1] <= 25.200000762939453) {
                                    classes[0] = 4; 
                                    classes[1] = 0; 
                                } else {
                                    if (features[1] <= 26.549999237060547) {
                                        classes[0] = 0; 
                                        classes[1] = 1; 
                                    } else {
                                        classes[0] = 4; 
                                        classes[1] = 0; 
                                    }
                                }
                            }
                        } else {
                            classes[0] = 6; 
                            classes[1] = 0; 
                        }
                    }
                } else {
                    if (features[2] <= 29.0) {
                        if (features[1] <= 25.849998474121094) {
                            classes[0] = 8; 
                            classes[1] = 0; 
                        } else {
                            if (features[1] <= 27.100000381469727) {
                                classes[0] = 0; 
                                classes[1] = 3; 
                            } else {
                                classes[0] = 1; 
                                classes[1] = 0; 
                            }
                        }
                    } else {
                        if (features[0] <= 0.5) {
                            if (features[2] <= 47.5) {
                                if (features[1] <= 27.349998474121094) {
                                    classes[0] = 3; 
                                    classes[1] = 0; 
                                } else {
                                    classes[0] = 0; 
                                    classes[1] = 1; 
                                }
                            } else {
                                classes[0] = 5; 
                                classes[1] = 0; 
                            }
                        } else {
                            classes[0] = 14; 
                            classes[1] = 0; 
                        }
                    }
                }
            } else {
                if (features[1] <= 9.949999809265137) {
                    if (features[0] <= 8.0) {
                        classes[0] = 1; 
                        classes[1] = 0; 
                    } else {
                        classes[0] = 0; 
                        classes[1] = 1; 
                    }
                } else {
                    if (features[1] <= 23.350000381469727) {
                        classes[0] = 9; 
                        classes[1] = 0; 
                    } else {
                        if (features[2] <= 38.0) {
                            if (features[1] <= 27.549999237060547) {
                                classes[0] = 24; 
                                classes[1] = 0; 
                            } else {
                                if (features[2] <= 28.5) {
                                    classes[0] = 1; 
                                    classes[1] = 0; 
                                } else {
                                    classes[0] = 0; 
                                    classes[1] = 1; 
                                }
                            }
                        } else {
                            if (features[0] <= 5.5) {
                                if (features[2] <= 58.5) {
                                    if (features[1] <= 25.349998474121094) {
                                        classes[0] = 3; 
                                        classes[1] = 0; 
                                    } else {
                                        if (features[0] <= 4.5) {
                                            classes[0] = 1; 
                                            classes[1] = 0; 
                                        } else {
                                            classes[0] = 0; 
                                            classes[1] = 2; 
                                        }
                                    }
                                } else {
                                    classes[0] = 0; 
                                    classes[1] = 2; 
                                }
                            } else {
                                if (features[1] <= 23.549999237060547) {
                                    classes[0] = 0; 
                                    classes[1] = 1; 
                                } else {
                                    if (features[0] <= 12.5) {
                                        if (features[1] <= 25.950000762939453) {
                                            if (features[0] <= 7.0) {
                                                if (features[1] <= 24.25) {
                                                    classes[0] = 1; 
                                                    classes[1] = 0; 
                                                } else {
                                                    classes[0] = 0; 
                                                    classes[1] = 1; 
                                                }
                                            } else {
                                                if (features[0] <= 8.5) {
                                                    if (features[1] <= 25.450000762939453) {
                                                        classes[0] = 4; 
                                                        classes[1] = 0; 
                                                    } else {
                                                        classes[0] = 0; 
                                                        classes[1] = 1; 
                                                    }
                                                } else {
                                                    if (features[1] <= 24.5) {
                                                        classes[0] = 1; 
                                                        classes[1] = 0; 
                                                    } else {
                                                        if (features[1] <= 25.349998474121094) {
                                                            classes[0] = 0; 
                                                            classes[1] = 1; 
                                                        } else {
                                                            classes[0] = 1; 
                                                            classes[1] = 0; 
                                                        }
                                                    }
                                                }
                                            }
                                        } else {
                                            if (features[2] <= 47.5) {
                                                if (features[0] <= 8.5) {
                                                    classes[0] = 3; 
                                                    classes[1] = 0; 
                                                } else {
                                                    classes[0] = 0; 
                                                    classes[1] = 2; 
                                                }
                                            } else {
                                                classes[0] = 17; 
                                                classes[1] = 0; 
                                            }
                                        }
                                    } else {
                                        classes[0] = 0; 
                                        classes[1] = 1; 
                                    }
                                }
                            }
                        }
                    }
                }
            }
        } else {
            if (features[1] <= 43.0) {
                if (features[0] <= 6.5) {
                    if (features[1] <= 30.450000762939453) {
                        if (features[1] <= 28.450000762939453) {
                            if (features[0] <= 1.0) {
                                classes[0] = 0; 
                                classes[1] = 2; 
                            } else {
                                if (features[1] <= 28.200000762939453) {
                                    if (features[0] <= 3.0) {
                                        if (features[2] <= 28.0) {
                                            classes[0] = 2; 
                                            classes[1] = 0; 
                                        } else {
                                            classes[0] = 0; 
                                            classes[1] = 2; 
                                        }
                                    } else {
                                        classes[0] = 2; 
                                        classes[1] = 0; 
                                    }
                                } else {
                                    classes[0] = 0; 
                                    classes[1] = 1; 
                                }
                            }
                        } else {
                            if (features[0] <= 5.5) {
                                if (features[0] <= 1.5) {
                                    if (features[0] <= 0.5) {
                                        classes[0] = 3; 
                                        classes[1] = 0; 
                                    } else {
                                        if (features[2] <= 35.0) {
                                            classes[0] = 14; 
                                            classes[1] = 0; 
                                        } else {
                                            classes[0] = 0; 
                                            classes[1] = 4; 
                                        }
                                    }
                                } else {
                                    if (features[2] <= 43.0) {
                                        if (features[2] <= 30.5) {
                                            classes[0] = 17; 
                                            classes[1] = 0; 
                                        } else {
                                            if (features[1] <= 29.799999237060547) {
                                                classes[0] = 10; 
                                                classes[1] = 0; 
                                            } else {
                                                if (features[2] <= 34.5) {
                                                    classes[0] = 0; 
                                                    classes[1] = 1; 
                                                } else {
                                                    classes[0] = 2; 
                                                    classes[1] = 0; 
                                                }
                                            }
                                        }
                                    } else {
                                        if (features[1] <= 28.849998474121094) {
                                            classes[0] = 1; 
                                            classes[1] = 0; 
                                        } else {
                                            if (features[1] <= 29.349998474121094) {
                                                classes[0] = 0; 
                                                classes[1] = 1; 
                                            } else {
                                                classes[0] = 1; 
                                                classes[1] = 0; 
                                            }
                                        }
                                    }
                                }
                            } else {
                                if (features[1] <= 29.649999618530273) {
                                    classes[0] = 0; 
                                    classes[1] = 1; 
                                } else {
                                    if (features[2] <= 36.5) {
                                        classes[0] = 5; 
                                        classes[1] = 0; 
                                    } else {
                                        classes[0] = 0; 
                                        classes[1] = 1; 
                                    }
                                }
                            }
                        }
                    } else {
                        if (features[1] <= 30.600000381469727) {
                            if (features[0] <= 2.5) {
                                if (features[0] <= 1.0) {
                                    if (features[2] <= 25.5) {
                                        classes[0] = 0; 
                                        classes[1] = 1; 
                                    } else {
                                        classes[0] = 1; 
                                        classes[1] = 0; 
                                    }
                                } else {
                                    if (features[2] <= 43.5) {
                                        classes[0] = 1; 
                                        classes[1] = 0; 
                                    } else {
                                        classes[0] = 0; 
                                        classes[1] = 2; 
                                    }
                                }
                            } else {
                                classes[0] = 0; 
                                classes[1] = 3; 
                            }
                        } else {
                            if (features[2] <= 28.5) {
                                if (features[2] <= 27.5) {
                                    if (features[0] <= 2.5) {
                                        if (features[0] <= 0.5) {
                                            if (features[1] <= 41.75) {
                                                if (features[1] <= 33.25) {
                                                    if (features[2] <= 21.5) {
                                                        classes[0] = 4; 
                                                        classes[1] = 0; 
                                                    } else {
                                                        if (features[1] <= 31.399999618530273) {
                                                            classes[0] = 5; 
                                                            classes[1] = 0; 
                                                        } else {
                                                            if (features[1] <= 32.20000076293945) {
                                                                classes[0] = 0; 
                                                                classes[1] = 1; 
                                                            } else {
                                                                classes[0] = 3; 
                                                                classes[1] = 0; 
                                                            }
                                                        }
                                                    }
                                                } else {
                                                    if (features[2] <= 24.5) {
                                                        if (features[2] <= 23.5) {
                                                            if (features[1] <= 34.75) {
                                                                classes[0] = 0; 
                                                                classes[1] = 5; 
                                                            } else {
                                                                classes[0] = 5; 
                                                                classes[1] = 0; 
                                                            }
                                                        } else {
                                                            classes[0] = 0; 
                                                            classes[1] = 1; 
                                                        }
                                                    } else {
                                                        classes[0] = 6; 
                                                        classes[1] = 0; 
                                                    }
                                                }
                                            } else {
                                                classes[0] = 0; 
                                                classes[1] = 5; 
                                            }
                                        } else {
                                            if (features[2] <= 26.5) {
                                                if (features[2] <= 25.5) {
                                                    if (features[1] <= 37.900001525878906) {
                                                        if (features[0] <= 1.5) {
                                                            classes[0] = 22; 
                                                            classes[1] = 0; 
                                                        } else {
                                                            if (features[2] <= 24.5) {
                                                                classes[0] = 6; 
                                                                classes[1] = 0; 
                                                            } else {
                                                                if (features[1] <= 32.150001525878906) {
                                                                    classes[0] = 0; 
                                                                    classes[1] = 1; 
                                                                } else {
                                                                    classes[0] = 5; 
                                                                    classes[1] = 0; 
                                                                }
                                                            }
                                                        }
                                                    } else {
                                                        if (features[0] <= 1.5) {
                                                            if (features[1] <= 39.29999923706055) {
                                                                classes[0] = 3; 
                                                                classes[1] = 0; 
                                                            } else {
                                                                if (features[2] <= 23.0) {
                                                                    if (features[1] <= 41.20000076293945) {
                                                                        classes[0] = 0; 
                                                                        classes[1] = 2; 
                                                                    } else {
                                                                        classes[0] = 3; 
                                                                        classes[1] = 0; 
                                                                    }
                                                                } else {
                                                                    classes[0] = 0; 
                                                                    classes[1] = 2; 
                                                                }
                                                            }
                                                        } else {
                                                            if (features[2] <= 22.0) {
                                                                classes[0] = 0; 
                                                                classes[1] = 1; 
                                                            } else {
                                                                if (features[1] <= 38.900001525878906) {
                                                                    classes[0] = 0; 
                                                                    classes[1] = 2; 
                                                                } else {
                                                                    classes[0] = 5; 
                                                                    classes[1] = 0; 
                                                                }
                                                            }
                                                        }
                                                    }
                                                } else {
                                                    classes[0] = 7; 
                                                    classes[1] = 0; 
                                                }
                                            } else {
                                                if (features[1] <= 37.5) {
                                                    classes[0] = 5; 
                                                    classes[1] = 0; 
                                                } else {
                                                    if (features[1] <= 38.900001525878906) {
                                                        classes[0] = 0; 
                                                        classes[1] = 4; 
                                                    } else {
                                                        classes[0] = 2; 
                                                        classes[1] = 0; 
                                                    }
                                                }
                                            }
                                        }
                                    } else {
                                        if (features[0] <= 4.5) {
                                            if (features[0] <= 3.5) {
                                                if (features[1] <= 34.599998474121094) {
                                                    if (features[1] <= 32.0) {
                                                        classes[0] = 3; 
                                                        classes[1] = 0; 
                                                    } else {
                                                        if (features[2] <= 26.5) {
                                                            classes[0] = 3; 
                                                            classes[1] = 0; 
                                                        } else {
                                                            classes[0] = 0; 
                                                            classes[1] = 3; 
                                                        }
                                                    }
                                                } else {
                                                    classes[0] = 0; 
                                                    classes[1] = 10; 
                                                }
                                            } else {
                                                if (features[2] <= 22.5) {
                                                    classes[0] = 0; 
                                                    classes[1] = 3; 
                                                } else {
                                                    if (features[2] <= 25.0) {
                                                        if (features[1] <= 33.05000305175781) {
                                                            if (features[1] <= 32.849998474121094) {
                                                                classes[0] = 2; 
                                                                classes[1] = 0; 
                                                            } else {
                                                                classes[0] = 0; 
                                                                classes[1] = 2; 
                                                            }
                                                        } else {
                                                            classes[0] = 5; 
                                                            classes[1] = 0; 
                                                        }
                                                    } else {
                                                        classes[0] = 0; 
                                                        classes[1] = 3; 
                                                    }
                                                }
                                            }
                                        } else {
                                            if (features[1] <= 34.75) {
                                                classes[0] = 2; 
                                                classes[1] = 0; 
                                            } else {
                                                if (features[2] <= 26.0) {
                                                    classes[0] = 0; 
                                                    classes[1] = 1; 
                                                } else {
                                                    classes[0] = 1; 
                                                    classes[1] = 0; 
                                                }
                                            }
                                        }
                                    }
                                } else {
                                    if (features[0] <= 1.5) {
                                        if (features[1] <= 35.099998474121094) {
                                            classes[0] = 0; 
                                            classes[1] = 1; 
                                        } else {
                                            classes[0] = 6; 
                                            classes[1] = 0; 
                                        }
                                    } else {
                                        classes[0] = 14; 
                                        classes[1] = 0; 
                                    }
                                }
                            } else {
                                if (features[0] <= 1.5) {
                                    if (features[0] <= 0.5) {
                                        if (features[1] <= 31.400001525878906) {
                                            classes[0] = 2; 
                                            classes[1] = 0; 
                                        } else {
                                            if (features[1] <= 32.70000076293945) {
                                                classes[0] = 0; 
                                                classes[1] = 1; 
                                            } else {
                                                if (features[2] <= 48.0) {
                                                    classes[0] = 3; 
                                                    classes[1] = 0; 
                                                } else {
                                                    classes[0] = 0; 
                                                    classes[1] = 1; 
                                                }
                                            }
                                        }
                                    } else {
                                        if (features[1] <= 33.69999694824219) {
                                            if (features[2] <= 37.5) {
                                                if (features[2] <= 31.0) {
                                                    classes[0] = 1; 
                                                    classes[1] = 0; 
                                                } else {
                                                    classes[0] = 0; 
                                                    classes[1] = 1; 
                                                }
                                            } else {
                                                classes[0] = 6; 
                                                classes[1] = 0; 
                                            }
                                        } else {
                                            classes[0] = 0; 
                                            classes[1] = 11; 
                                        }
                                    }
                                } else {
                                    if (features[2] <= 41.5) {
                                        if (features[2] <= 39.5) {
                                            if (features[2] <= 36.5) {
                                                if (features[1] <= 37.0) {
                                                    if (features[2] <= 32.5) {
                                                        if (features[2] <= 29.5) {
                                                            classes[0] = 0; 
                                                            classes[1] = 5; 
                                                        } else {
                                                            if (features[2] <= 31.5) {
                                                                if (features[2] <= 30.5) {
                                                                    if (features[1] <= 34.70000076293945) {
                                                                        classes[0] = 0; 
                                                                        classes[1] = 4; 
                                                                    } else {
                                                                        classes[0] = 2; 
                                                                        classes[1] = 0; 
                                                                    }
                                                                } else {
                                                                    if (features[0] <= 2.5) {
                                                                        classes[0] = 3; 
                                                                        classes[1] = 0; 
                                                                    } else {
                                                                        classes[0] = 0; 
                                                                        classes[1] = 4; 
                                                                    }
                                                                }
                                                            } else {
                                                                classes[0] = 0; 
                                                                classes[1] = 2; 
                                                            }
                                                        }
                                                    } else {
                                                        if (features[2] <= 34.5) {
                                                            classes[0] = 11; 
                                                            classes[1] = 0; 
                                                        } else {
                                                            if (features[0] <= 4.0) {
                                                                classes[0] = 0; 
                                                                classes[1] = 3; 
                                                            } else {
                                                                if (features[1] <= 35.400001525878906) {
                                                                    classes[0] = 0; 
                                                                    classes[1] = 5; 
                                                                } else {
                                                                    classes[0] = 2; 
                                                                    classes[1] = 0; 
                                                                }
                                                            }
                                                        }
                                                    }
                                                } else {
                                                    classes[0] = 8; 
                                                    classes[1] = 0; 
                                                }
                                            } else {
                                                classes[0] = 6; 
                                                classes[1] = 0; 
                                            }
                                        } else {
                                            if (features[0] <= 5.5) {
                                                classes[0] = 0; 
                                                classes[1] = 3; 
                                            } else {
                                                if (features[2] <= 40.5) {
                                                    if (features[1] <= 33.80000305175781) {
                                                        classes[0] = 0; 
                                                        classes[1] = 4; 
                                                    } else {
                                                        classes[0] = 1; 
                                                        classes[1] = 0; 
                                                    }
                                                } else {
                                                    classes[0] = 0; 
                                                    classes[1] = 1; 
                                                }
                                            }
                                        }
                                    } else {
                                        if (features[0] <= 5.5) {
                                            if (features[2] <= 43.5) {
                                                classes[0] = 3; 
                                                classes[1] = 0; 
                                            } else {
                                                if (features[2] <= 53.0) {
                                                    if (features[2] <= 48.5) {
                                                        if (features[1] <= 32.900001525878906) {
                                                            classes[0] = 0; 
                                                            classes[1] = 1; 
                                                        } else {
                                                            classes[0] = 1; 
                                                            classes[1] = 0; 
                                                        }
                                                    } else {
                                                        classes[0] = 0; 
                                                        classes[1] = 2; 
                                                    }
                                                } else {
                                                    if (features[2] <= 67.5) {
                                                        if (features[1] <= 31.80000114440918) {
                                                            classes[0] = 0; 
                                                            classes[1] = 1; 
                                                        } else {
                                                            if (features[1] <= 35.349998474121094) {
                                                                if (features[2] <= 62.5) {
                                                                    classes[0] = 0; 
                                                                    classes[1] = 1; 
                                                                } else {
                                                                    classes[0] = 3; 
                                                                    classes[1] = 0; 
                                                                }
                                                            } else {
                                                                classes[0] = 4; 
                                                                classes[1] = 0; 
                                                            }
                                                        }
                                                    } else {
                                                        classes[0] = 0; 
                                                        classes[1] = 1; 
                                                    }
                                                }
                                            }
                                        } else {
                                            if (features[1] <= 32.79999923706055) {
                                                classes[0] = 3; 
                                                classes[1] = 0; 
                                            } else {
                                                if (features[1] <= 33.900001525878906) {
                                                    if (features[1] <= 33.69999694824219) {
                                                        if (features[2] <= 49.5) {
                                                            classes[0] = 3; 
                                                            classes[1] = 0; 
                                                        } else {
                                                            classes[0] = 0; 
                                                            classes[1] = 1; 
                                                        }
                                                    } else {
                                                        classes[0] = 0; 
                                                        classes[1] = 1; 
                                                    }
                                                } else {
                                                    classes[0] = 2; 
                                                    classes[1] = 0; 
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                } else {
                    if (features[2] <= 33.5) {
                        classes[0] = 0; 
                        classes[1] = 9; 
                    } else {
                        if (features[2] <= 42.5) {
                            if (features[0] <= 10.5) {
                                if (features[1] <= 32.650001525878906) {
                                    if (features[2] <= 37.5) {
                                        classes[0] = 4; 
                                        classes[1] = 0; 
                                    } else {
                                        if (features[1] <= 31.049999237060547) {
                                            classes[0] = 0; 
                                            classes[1] = 3; 
                                        } else {
                                            classes[0] = 7; 
                                            classes[1] = 0; 
                                        }
                                    }
                                } else {
                                    if (features[1] <= 35.45000076293945) {
                                        if (features[1] <= 34.599998474121094) {
                                            if (features[2] <= 39.5) {
                                                classes[0] = 0; 
                                                classes[1] = 7; 
                                            } else {
                                                if (features[1] <= 32.94999694824219) {
                                                    classes[0] = 0; 
                                                    classes[1] = 1; 
                                                } else {
                                                    if (features[0] <= 8.0) {
                                                        classes[0] = 2; 
                                                        classes[1] = 0; 
                                                    } else {
                                                        if (features[2] <= 41.0) {
                                                            classes[0] = 1; 
                                                            classes[1] = 0; 
                                                        } else {
                                                            classes[0] = 0; 
                                                            classes[1] = 1; 
                                                        }
                                                    }
                                                }
                                            }
                                        } else {
                                            classes[0] = 4; 
                                            classes[1] = 0; 
                                        }
                                    } else {
                                        if (features[2] <= 37.5) {
                                            if (features[0] <= 7.5) {
                                                classes[0] = 1; 
                                                classes[1] = 0; 
                                            } else {
                                                classes[0] = 0; 
                                                classes[1] = 1; 
                                            }
                                        } else {
                                            classes[0] = 0; 
                                            classes[1] = 10; 
                                        }
                                    }
                                }
                            } else {
                                if (features[0] <= 11.5) {
                                    classes[0] = 4; 
                                    classes[1] = 0; 
                                } else {
                                    if (features[2] <= 38.5) {
                                        classes[0] = 0; 
                                        classes[1] = 3; 
                                    } else {
                                        classes[0] = 6; 
                                        classes[1] = 0; 
                                    }
                                }
                            }
                        } else {
                            if (features[0] <= 13.5) {
                                if (features[1] <= 39.099998474121094) {
                                    if (features[2] <= 59.0) {
                                        if (features[1] <= 36.69999694824219) {
                                            if (features[1] <= 29.799999237060547) {
                                                classes[0] = 0; 
                                                classes[1] = 7; 
                                            } else {
                                                if (features[0] <= 12.0) {
                                                    if (features[2] <= 50.5) {
                                                        if (features[2] <= 48.5) {
                                                            if (features[0] <= 8.5) {
                                                                classes[0] = 0; 
                                                                classes[1] = 7; 
                                                            } else {
                                                                if (features[1] <= 31.900001525878906) {
                                                                    classes[0] = 1; 
                                                                    classes[1] = 0; 
                                                                } else {
                                                                    classes[0] = 0; 
                                                                    classes[1] = 4; 
                                                                }
                                                            }
                                                        } else {
                                                            if (features[1] <= 35.75) {
                                                                classes[0] = 3; 
                                                                classes[1] = 0; 
                                                            } else {
                                                                classes[0] = 0; 
                                                                classes[1] = 3; 
                                                            }
                                                        }
                                                    } else {
                                                        classes[0] = 0; 
                                                        classes[1] = 7; 
                                                    }
                                                } else {
                                                    classes[0] = 3; 
                                                    classes[1] = 0; 
                                                }
                                            }
                                        } else {
                                            classes[0] = 8; 
                                            classes[1] = 0; 
                                        }
                                    } else {
                                        classes[0] = 3; 
                                        classes[1] = 0; 
                                    }
                                } else {
                                    classes[0] = 0; 
                                    classes[1] = 7; 
                                }
                            } else {
                                classes[0] = 0; 
                                classes[1] = 3; 
                            }
                        }
                    }
                }
            } else {
                if (features[1] <= 47.20000076293945) {
                    if (features[0] <= 7.0) {
                        if (features[2] <= 55.5) {
                            if (features[1] <= 44.349998474121094) {
                                if (features[1] <= 43.25) {
                                    classes[0] = 0; 
                                    classes[1] = 4; 
                                } else {
                                    if (features[1] <= 43.54999923706055) {
                                        if (features[0] <= 1.5) {
                                            if (features[2] <= 29.5) {
                                                if (features[1] <= 43.400001525878906) {
                                                    classes[0] = 0; 
                                                    classes[1] = 2; 
                                                } else {
                                                    classes[0] = 1; 
                                                    classes[1] = 0; 
                                                }
                                            } else {
                                                classes[0] = 2; 
                                                classes[1] = 0; 
                                            }
                                        } else {
                                            classes[0] = 0; 
                                            classes[1] = 1; 
                                        }
                                    } else {
                                        classes[0] = 0; 
                                        classes[1] = 4; 
                                    }
                                }
                            } else {
                                if (features[2] <= 28.0) {
                                    if (features[0] <= 1.5) {
                                        classes[0] = 3; 
                                        classes[1] = 0; 
                                    } else {
                                        if (features[2] <= 25.0) {
                                            classes[0] = 0; 
                                            classes[1] = 1; 
                                        } else {
                                            classes[0] = 2; 
                                            classes[1] = 0; 
                                        }
                                    }
                                } else {
                                    if (features[2] <= 46.5) {
                                        classes[0] = 0; 
                                        classes[1] = 3; 
                                    } else {
                                        classes[0] = 1; 
                                        classes[1] = 0; 
                                    }
                                }
                            }
                        } else {
                            classes[0] = 2; 
                            classes[1] = 0; 
                        }
                    } else {
                        if (features[0] <= 10.5) {
                            classes[0] = 0; 
                            classes[1] = 4; 
                        } else {
                            if (features[1] <= 44.80000305175781) {
                                classes[0] = 0; 
                                classes[1] = 1; 
                            } else {
                                classes[0] = 1; 
                                classes[1] = 0; 
                            }
                        }
                    }
                } else {
                    if (features[2] <= 24.0) {
                        classes[0] = 2; 
                        classes[1] = 0; 
                    } else {
                        classes[0] = 0; 
                        classes[1] = 23; 
                    }
                }
            }
        }
        int class_idx = 0;
        int class_val = classes[0];
        for (int i = 1; i < 2; i++) {
            if (classes[i] > class_val) {
                class_idx = i;
                class_val = classes[i];
            }
        }
        return class_idx;
    }
    
    public static int predict_4(double[] features) {
        int[] classes = new int[2];
        
        if (features[2] <= 28.5) {
            if (features[1] <= 29.950000762939453) {
                if (features[2] <= 21.5) {
                    classes[0] = 36; 
                    classes[1] = 0; 
                } else {
                    if (features[0] <= 7.5) {
                        if (features[1] <= 25.5) {
                            classes[0] = 51; 
                            classes[1] = 0; 
                        } else {
                            if (features[0] <= 1.5) {
                                classes[0] = 17; 
                                classes[1] = 0; 
                            } else {
                                if (features[0] <= 3.5) {
                                    if (features[0] <= 2.5) {
                                        if (features[1] <= 28.700000762939453) {
                                            if (features[1] <= 27.75) {
                                                if (features[1] <= 27.399999618530273) {
                                                    if (features[2] <= 24.5) {
                                                        classes[0] = 6; 
                                                        classes[1] = 0; 
                                                    } else {
                                                        classes[0] = 0; 
                                                        classes[1] = 1; 
                                                    }
                                                } else {
                                                    classes[0] = 0; 
                                                    classes[1] = 1; 
                                                }
                                            } else {
                                                classes[0] = 4; 
                                                classes[1] = 0; 
                                            }
                                        } else {
                                            if (features[1] <= 28.950000762939453) {
                                                classes[0] = 0; 
                                                classes[1] = 1; 
                                            } else {
                                                classes[0] = 1; 
                                                classes[1] = 0; 
                                            }
                                        }
                                    } else {
                                        if (features[1] <= 25.799999237060547) {
                                            if (features[2] <= 23.0) {
                                                classes[0] = 0; 
                                                classes[1] = 2; 
                                            } else {
                                                classes[0] = 1; 
                                                classes[1] = 0; 
                                            }
                                        } else {
                                            classes[0] = 7; 
                                            classes[1] = 0; 
                                        }
                                    }
                                } else {
                                    classes[0] = 9; 
                                    classes[1] = 0; 
                                }
                            }
                        }
                    } else {
                        classes[0] = 0; 
                        classes[1] = 2; 
                    }
                }
            } else {
                if (features[0] <= 2.5) {
                    if (features[2] <= 27.5) {
                        if (features[0] <= 0.5) {
                            if (features[2] <= 26.5) {
                                if (features[1] <= 41.75) {
                                    if (features[2] <= 25.5) {
                                        if (features[2] <= 24.5) {
                                            if (features[2] <= 23.5) {
                                                if (features[2] <= 22.5) {
                                                    if (features[2] <= 21.5) {
                                                        if (features[1] <= 35.19999694824219) {
                                                            if (features[1] <= 33.5) {
                                                                classes[0] = 4; 
                                                                classes[1] = 0; 
                                                            } else {
                                                                classes[0] = 0; 
                                                                classes[1] = 4; 
                                                            }
                                                        } else {
                                                            classes[0] = 5; 
                                                            classes[1] = 0; 
                                                        }
                                                    } else {
                                                        if (features[1] <= 39.650001525878906) {
                                                            if (features[1] <= 33.0) {
                                                                classes[0] = 1; 
                                                                classes[1] = 0; 
                                                            } else {
                                                                classes[0] = 0; 
                                                                classes[1] = 2; 
                                                            }
                                                        } else {
                                                            classes[0] = 3; 
                                                            classes[1] = 0; 
                                                        }
                                                    }
                                                } else {
                                                    if (features[1] <= 34.79999923706055) {
                                                        classes[0] = 0; 
                                                        classes[1] = 1; 
                                                    } else {
                                                        classes[0] = 7; 
                                                        classes[1] = 0; 
                                                    }
                                                }
                                            } else {
                                                classes[0] = 0; 
                                                classes[1] = 2; 
                                            }
                                        } else {
                                            if (features[1] <= 32.900001525878906) {
                                                classes[0] = 0; 
                                                classes[1] = 2; 
                                            } else {
                                                classes[0] = 8; 
                                                classes[1] = 0; 
                                            }
                                        }
                                    } else {
                                        classes[0] = 7; 
                                        classes[1] = 0; 
                                    }
                                } else {
                                    if (features[2] <= 22.5) {
                                        classes[0] = 3; 
                                        classes[1] = 0; 
                                    } else {
                                        if (features[2] <= 23.5) {
                                            classes[0] = 0; 
                                            classes[1] = 2; 
                                        } else {
                                            if (features[2] <= 24.5) {
                                                if (features[1] <= 42.54999923706055) {
                                                    classes[0] = 0; 
                                                    classes[1] = 3; 
                                                } else {
                                                    classes[0] = 2; 
                                                    classes[1] = 0; 
                                                }
                                            } else {
                                                if (features[2] <= 25.5) {
                                                    classes[0] = 0; 
                                                    classes[1] = 3; 
                                                } else {
                                                    if (features[1] <= 48.75) {
                                                        if (features[1] <= 45.599998474121094) {
                                                            classes[0] = 0; 
                                                            classes[1] = 1; 
                                                        } else {
                                                            classes[0] = 2; 
                                                            classes[1] = 0; 
                                                        }
                                                    } else {
                                                        classes[0] = 0; 
                                                        classes[1] = 3; 
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            } else {
                                classes[0] = 6; 
                                classes[1] = 0; 
                            }
                        } else {
                            if (features[2] <= 26.5) {
                                if (features[0] <= 1.5) {
                                    if (features[2] <= 24.5) {
                                        if (features[2] <= 23.5) {
                                            if (features[2] <= 22.5) {
                                                if (features[2] <= 21.5) {
                                                    if (features[1] <= 35.849998474121094) {
                                                        if (features[1] <= 33.400001525878906) {
                                                            classes[0] = 3; 
                                                            classes[1] = 0; 
                                                        } else {
                                                            classes[0] = 0; 
                                                            classes[1] = 1; 
                                                        }
                                                    } else {
                                                        classes[0] = 4; 
                                                        classes[1] = 0; 
                                                    }
                                                } else {
                                                    if (features[1] <= 42.650001525878906) {
                                                        classes[0] = 5; 
                                                        classes[1] = 0; 
                                                    } else {
                                                        classes[0] = 0; 
                                                        classes[1] = 1; 
                                                    }
                                                }
                                            } else {
                                                classes[0] = 8; 
                                                classes[1] = 0; 
                                            }
                                        } else {
                                            if (features[1] <= 38.95000076293945) {
                                                classes[0] = 6; 
                                                classes[1] = 0; 
                                            } else {
                                                classes[0] = 0; 
                                                classes[1] = 2; 
                                            }
                                        }
                                    } else {
                                        classes[0] = 4; 
                                        classes[1] = 0; 
                                    }
                                } else {
                                    if (features[2] <= 22.5) {
                                        classes[0] = 5; 
                                        classes[1] = 0; 
                                    } else {
                                        if (features[1] <= 43.0) {
                                            if (features[2] <= 23.5) {
                                                if (features[1] <= 34.79999923706055) {
                                                    classes[0] = 2; 
                                                    classes[1] = 0; 
                                                } else {
                                                    if (features[1] <= 38.54999923706055) {
                                                        classes[0] = 0; 
                                                        classes[1] = 2; 
                                                    } else {
                                                        classes[0] = 1; 
                                                        classes[1] = 0; 
                                                    }
                                                }
                                            } else {
                                                if (features[1] <= 33.25) {
                                                    classes[0] = 0; 
                                                    classes[1] = 1; 
                                                } else {
                                                    if (features[1] <= 38.25) {
                                                        classes[0] = 7; 
                                                        classes[1] = 0; 
                                                    } else {
                                                        if (features[2] <= 24.5) {
                                                            classes[0] = 3; 
                                                            classes[1] = 0; 
                                                        } else {
                                                            if (features[1] <= 39.599998474121094) {
                                                                classes[0] = 0; 
                                                                classes[1] = 1; 
                                                            } else {
                                                                classes[0] = 3; 
                                                                classes[1] = 0; 
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        } else {
                                            classes[0] = 0; 
                                            classes[1] = 1; 
                                        }
                                    }
                                }
                            } else {
                                if (features[1] <= 41.54999923706055) {
                                    classes[0] = 2; 
                                    classes[1] = 0; 
                                } else {
                                    classes[0] = 0; 
                                    classes[1] = 3; 
                                }
                            }
                        }
                    } else {
                        if (features[1] <= 34.75) {
                            classes[0] = 0; 
                            classes[1] = 2; 
                        } else {
                            if (features[1] <= 40.69999694824219) {
                                if (features[1] <= 37.05000305175781) {
                                    classes[0] = 1; 
                                    classes[1] = 0; 
                                } else {
                                    if (features[1] <= 39.0) {
                                        classes[0] = 0; 
                                        classes[1] = 1; 
                                    } else {
                                        classes[0] = 1; 
                                        classes[1] = 0; 
                                    }
                                }
                            } else {
                                classes[0] = 0; 
                                classes[1] = 2; 
                            }
                        }
                    }
                } else {
                    if (features[1] <= 31.75) {
                        if (features[0] <= 3.5) {
                            if (features[1] <= 30.399999618530273) {
                                classes[0] = 0; 
                                classes[1] = 2; 
                            } else {
                                if (features[2] <= 24.5) {
                                    classes[0] = 5; 
                                    classes[1] = 0; 
                                } else {
                                    if (features[1] <= 30.899999618530273) {
                                        classes[0] = 2; 
                                        classes[1] = 0; 
                                    } else {
                                        if (features[2] <= 27.0) {
                                            classes[0] = 0; 
                                            classes[1] = 3; 
                                        } else {
                                            classes[0] = 1; 
                                            classes[1] = 2; 
                                        }
                                    }
                                }
                            }
                        } else {
                            classes[0] = 0; 
                            classes[1] = 7; 
                        }
                    } else {
                        if (features[1] <= 33.25) {
                            if (features[1] <= 33.0) {
                                if (features[0] <= 3.5) {
                                    classes[0] = 2; 
                                    classes[1] = 0; 
                                } else {
                                    if (features[1] <= 32.849998474121094) {
                                        classes[0] = 1; 
                                        classes[1] = 0; 
                                    } else {
                                        classes[0] = 0; 
                                        classes[1] = 1; 
                                    }
                                }
                            } else {
                                classes[0] = 7; 
                                classes[1] = 0; 
                            }
                        } else {
                            if (features[1] <= 33.650001525878906) {
                                classes[0] = 0; 
                                classes[1] = 2; 
                            } else {
                                if (features[2] <= 26.5) {
                                    if (features[0] <= 3.5) {
                                        if (features[1] <= 34.45000076293945) {
                                            classes[0] = 1; 
                                            classes[1] = 0; 
                                        } else {
                                            classes[0] = 0; 
                                            classes[1] = 4; 
                                        }
                                    } else {
                                        if (features[1] <= 34.54999923706055) {
                                            classes[0] = 3; 
                                            classes[1] = 0; 
                                        } else {
                                            if (features[2] <= 24.0) {
                                                classes[0] = 0; 
                                                classes[1] = 1; 
                                            } else {
                                                if (features[1] <= 44.04999923706055) {
                                                    classes[0] = 0; 
                                                    classes[1] = 3; 
                                                } else {
                                                    classes[0] = 1; 
                                                    classes[1] = 0; 
                                                }
                                            }
                                        }
                                    }
                                } else {
                                    if (features[1] <= 34.80000305175781) {
                                        if (features[1] <= 34.150001525878906) {
                                            classes[0] = 1; 
                                            classes[1] = 0; 
                                        } else {
                                            classes[0] = 0; 
                                            classes[1] = 1; 
                                        }
                                    } else {
                                        classes[0] = 10; 
                                        classes[1] = 0; 
                                    }
                                }
                            }
                        }
                    }
                }
            }
        } else {
            if (features[1] <= 27.349998474121094) {
                if (features[1] <= 9.649999618530273) {
                    if (features[2] <= 49.5) {
                        classes[0] = 0; 
                        classes[1] = 2; 
                    } else {
                        classes[0] = 1; 
                        classes[1] = 0; 
                    }
                } else {
                    if (features[0] <= 1.5) {
                        if (features[0] <= 0.5) {
                            classes[0] = 2; 
                            classes[1] = 0; 
                        } else {
                            if (features[2] <= 34.5) {
                                classes[0] = 0; 
                                classes[1] = 4; 
                            } else {
                                classes[0] = 3; 
                                classes[1] = 0; 
                            }
                        }
                    } else {
                        if (features[0] <= 9.5) {
                            if (features[1] <= 25.049999237060547) {
                                if (features[2] <= 49.0) {
                                    classes[0] = 22; 
                                    classes[1] = 0; 
                                } else {
                                    if (features[2] <= 54.0) {
                                        classes[0] = 0; 
                                        classes[1] = 2; 
                                    } else {
                                        if (features[1] <= 24.0) {
                                            if (features[2] <= 58.5) {
                                                classes[0] = 2; 
                                                classes[1] = 0; 
                                            } else {
                                                if (features[2] <= 66.0) {
                                                    classes[0] = 0; 
                                                    classes[1] = 2; 
                                                } else {
                                                    classes[0] = 1; 
                                                    classes[1] = 0; 
                                                }
                                            }
                                        } else {
                                            classes[0] = 6; 
                                            classes[1] = 0; 
                                        }
                                    }
                                }
                            } else {
                                if (features[2] <= 60.5) {
                                    if (features[1] <= 25.150001525878906) {
                                        classes[0] = 0; 
                                        classes[1] = 2; 
                                    } else {
                                        if (features[2] <= 29.5) {
                                            classes[0] = 0; 
                                            classes[1] = 2; 
                                        } else {
                                            if (features[2] <= 38.0) {
                                                if (features[0] <= 6.5) {
                                                    if (features[0] <= 5.5) {
                                                        classes[0] = 1; 
                                                        classes[1] = 0; 
                                                    } else {
                                                        if (features[2] <= 32.5) {
                                                            classes[0] = 1; 
                                                            classes[1] = 0; 
                                                        } else {
                                                            classes[0] = 0; 
                                                            classes[1] = 1; 
                                                        }
                                                    }
                                                } else {
                                                    classes[0] = 3; 
                                                    classes[1] = 0; 
                                                }
                                            } else {
                                                if (features[2] <= 45.0) {
                                                    classes[0] = 2; 
                                                    classes[1] = 3; 
                                                } else {
                                                    if (features[0] <= 6.0) {
                                                        classes[0] = 0; 
                                                        classes[1] = 2; 
                                                    } else {
                                                        classes[0] = 1; 
                                                        classes[1] = 0; 
                                                    }
                                                }
                                            }
                                        }
                                    }
                                } else {
                                    classes[0] = 6; 
                                    classes[1] = 0; 
                                }
                            }
                        } else {
                            classes[0] = 6; 
                            classes[1] = 0; 
                        }
                    }
                }
            } else {
                if (features[1] <= 36.54999923706055) {
                    if (features[1] <= 36.04999923706055) {
                        if (features[1] <= 32.849998474121094) {
                            if (features[0] <= 7.5) {
                                if (features[2] <= 43.0) {
                                    if (features[2] <= 36.5) {
                                        if (features[0] <= 6.5) {
                                            if (features[0] <= 5.5) {
                                                if (features[1] <= 31.400001525878906) {
                                                    if (features[1] <= 29.799999237060547) {
                                                        if (features[2] <= 35.0) {
                                                            if (features[2] <= 32.0) {
                                                                classes[0] = 4; 
                                                                classes[1] = 0; 
                                                            } else {
                                                                if (features[2] <= 33.5) {
                                                                    if (features[0] <= 3.0) {
                                                                        classes[0] = 1; 
                                                                        classes[1] = 0; 
                                                                    } else {
                                                                        classes[0] = 0; 
                                                                        classes[1] = 1; 
                                                                    }
                                                                } else {
                                                                    if (features[0] <= 3.5) {
                                                                        classes[0] = 0; 
                                                                        classes[1] = 1; 
                                                                    } else {
                                                                        classes[0] = 4; 
                                                                        classes[1] = 0; 
                                                                    }
                                                                }
                                                            }
                                                        } else {
                                                            classes[0] = 0; 
                                                            classes[1] = 1; 
                                                        }
                                                    } else {
                                                        if (features[1] <= 30.200000762939453) {
                                                            classes[0] = 0; 
                                                            classes[1] = 3; 
                                                        } else {
                                                            if (features[1] <= 30.700000762939453) {
                                                                if (features[0] <= 2.5) {
                                                                    classes[0] = 3; 
                                                                    classes[1] = 0; 
                                                                } else {
                                                                    classes[0] = 0; 
                                                                    classes[1] = 2; 
                                                                }
                                                            } else {
                                                                if (features[0] <= 4.5) {
                                                                    if (features[2] <= 29.5) {
                                                                        classes[0] = 0; 
                                                                        classes[1] = 1; 
                                                                    } else {
                                                                        classes[0] = 5; 
                                                                        classes[1] = 0; 
                                                                    }
                                                                } else {
                                                                    classes[0] = 0; 
                                                                    classes[1] = 1; 
                                                                }
                                                            }
                                                        }
                                                    }
                                                } else {
                                                    classes[0] = 0; 
                                                    classes[1] = 4; 
                                                }
                                            } else {
                                                classes[0] = 5; 
                                                classes[1] = 0; 
                                            }
                                        } else {
                                            classes[0] = 0; 
                                            classes[1] = 5; 
                                        }
                                    } else {
                                        if (features[1] <= 30.149999618530273) {
                                            if (features[0] <= 2.5) {
                                                classes[0] = 0; 
                                                classes[1] = 1; 
                                            } else {
                                                if (features[1] <= 29.75) {
                                                    classes[0] = 5; 
                                                    classes[1] = 0; 
                                                } else {
                                                    classes[0] = 0; 
                                                    classes[1] = 1; 
                                                }
                                            }
                                        } else {
                                            if (features[2] <= 38.5) {
                                                if (features[2] <= 37.5) {
                                                    classes[0] = 4; 
                                                    classes[1] = 0; 
                                                } else {
                                                    if (features[0] <= 1.5) {
                                                        classes[0] = 0; 
                                                        classes[1] = 1; 
                                                    } else {
                                                        classes[0] = 1; 
                                                        classes[1] = 0; 
                                                    }
                                                }
                                            } else {
                                                classes[0] = 10; 
                                                classes[1] = 0; 
                                            }
                                        }
                                    }
                                } else {
                                    if (features[0] <= 6.5) {
                                        if (features[2] <= 47.0) {
                                            classes[0] = 0; 
                                            classes[1] = 6; 
                                        } else {
                                            if (features[1] <= 32.650001525878906) {
                                                if (features[2] <= 48.5) {
                                                    classes[0] = 1; 
                                                    classes[1] = 0; 
                                                } else {
                                                    if (features[2] <= 62.5) {
                                                        classes[0] = 0; 
                                                        classes[1] = 9; 
                                                    } else {
                                                        if (features[1] <= 29.799999237060547) {
                                                            classes[0] = 2; 
                                                            classes[1] = 0; 
                                                        } else {
                                                            classes[0] = 0; 
                                                            classes[1] = 3; 
                                                        }
                                                    }
                                                }
                                            } else {
                                                classes[0] = 2; 
                                                classes[1] = 0; 
                                            }
                                        }
                                    } else {
                                        classes[0] = 2; 
                                        classes[1] = 0; 
                                    }
                                }
                            } else {
                                if (features[0] <= 11.5) {
                                    if (features[2] <= 43.5) {
                                        if (features[0] <= 9.5) {
                                            if (features[1] <= 31.0) {
                                                classes[0] = 0; 
                                                classes[1] = 4; 
                                            } else {
                                                classes[0] = 4; 
                                                classes[1] = 0; 
                                            }
                                        } else {
                                            if (features[1] <= 29.200000762939453) {
                                                classes[0] = 0; 
                                                classes[1] = 3; 
                                            } else {
                                                if (features[2] <= 38.5) {
                                                    classes[0] = 1; 
                                                    classes[1] = 0; 
                                                } else {
                                                    classes[0] = 0; 
                                                    classes[1] = 2; 
                                                }
                                            }
                                        }
                                    } else {
                                        if (features[2] <= 53.5) {
                                            if (features[0] <= 8.5) {
                                                classes[0] = 0; 
                                                classes[1] = 5; 
                                            } else {
                                                if (features[1] <= 30.649999618530273) {
                                                    classes[0] = 0; 
                                                    classes[1] = 6; 
                                                } else {
                                                    if (features[1] <= 31.799999237060547) {
                                                        classes[0] = 1; 
                                                        classes[1] = 0; 
                                                    } else {
                                                        classes[0] = 0; 
                                                        classes[1] = 1; 
                                                    }
                                                }
                                            }
                                        } else {
                                            if (features[2] <= 59.0) {
                                                classes[0] = 2; 
                                                classes[1] = 0; 
                                            } else {
                                                classes[0] = 0; 
                                                classes[1] = 3; 
                                            }
                                        }
                                    }
                                } else {
                                    classes[0] = 2; 
                                    classes[1] = 0; 
                                }
                            }
                        } else {
                            if (features[1] <= 33.05000305175781) {
                                classes[0] = 0; 
                                classes[1] = 12; 
                            } else {
                                if (features[2] <= 39.5) {
                                    if (features[2] <= 29.5) {
                                        classes[0] = 0; 
                                        classes[1] = 3; 
                                    } else {
                                        if (features[1] <= 34.599998474121094) {
                                            if (features[2] <= 30.5) {
                                                classes[0] = 2; 
                                                classes[1] = 0; 
                                            } else {
                                                if (features[0] <= 9.5) {
                                                    if (features[1] <= 34.04999923706055) {
                                                        if (features[1] <= 33.849998474121094) {
                                                            if (features[0] <= 2.5) {
                                                                classes[0] = 1; 
                                                                classes[1] = 0; 
                                                            } else {
                                                                classes[0] = 0; 
                                                                classes[1] = 3; 
                                                            }
                                                        } else {
                                                            classes[0] = 0; 
                                                            classes[1] = 4; 
                                                        }
                                                    } else {
                                                        if (features[2] <= 37.5) {
                                                            classes[0] = 0; 
                                                            classes[1] = 2; 
                                                        } else {
                                                            classes[0] = 1; 
                                                            classes[1] = 0; 
                                                        }
                                                    }
                                                } else {
                                                    if (features[1] <= 33.44999694824219) {
                                                        classes[0] = 3; 
                                                        classes[1] = 0; 
                                                    } else {
                                                        classes[0] = 0; 
                                                        classes[1] = 1; 
                                                    }
                                                }
                                            }
                                        } else {
                                            if (features[2] <= 36.0) {
                                                if (features[1] <= 34.95000076293945) {
                                                    classes[0] = 6; 
                                                    classes[1] = 0; 
                                                } else {
                                                    if (features[0] <= 4.0) {
                                                        classes[0] = 0; 
                                                        classes[1] = 2; 
                                                    } else {
                                                        if (features[1] <= 35.400001525878906) {
                                                            classes[0] = 0; 
                                                            classes[1] = 2; 
                                                        } else {
                                                            classes[0] = 1; 
                                                            classes[1] = 0; 
                                                        }
                                                    }
                                                }
                                            } else {
                                                classes[0] = 4; 
                                                classes[1] = 0; 
                                            }
                                        }
                                    }
                                } else {
                                    if (features[0] <= 11.5) {
                                        if (features[2] <= 59.0) {
                                            if (features[2] <= 49.5) {
                                                if (features[0] <= 7.5) {
                                                    if (features[2] <= 44.5) {
                                                        if (features[2] <= 43.5) {
                                                            if (features[0] <= 3.5) {
                                                                classes[0] = 0; 
                                                                classes[1] = 6; 
                                                            } else {
                                                                if (features[2] <= 40.5) {
                                                                    if (features[1] <= 33.80000305175781) {
                                                                        classes[0] = 0; 
                                                                        classes[1] = 3; 
                                                                    } else {
                                                                        classes[0] = 2; 
                                                                        classes[1] = 0; 
                                                                    }
                                                                } else {
                                                                    if (features[1] <= 34.400001525878906) {
                                                                        classes[0] = 1; 
                                                                        classes[1] = 0; 
                                                                    } else {
                                                                        classes[0] = 0; 
                                                                        classes[1] = 1; 
                                                                    }
                                                                }
                                                            }
                                                        } else {
                                                            if (features[0] <= 1.5) {
                                                                classes[0] = 1; 
                                                                classes[1] = 0; 
                                                            } else {
                                                                classes[0] = 0; 
                                                                classes[1] = 1; 
                                                            }
                                                        }
                                                    } else {
                                                        classes[0] = 3; 
                                                        classes[1] = 0; 
                                                    }
                                                } else {
                                                    classes[0] = 0; 
                                                    classes[1] = 4; 
                                                }
                                            } else {
                                                classes[0] = 0; 
                                                classes[1] = 14; 
                                            }
                                        } else {
                                            if (features[1] <= 35.150001525878906) {
                                                if (features[1] <= 34.45000076293945) {
                                                    classes[0] = 1; 
                                                    classes[1] = 0; 
                                                } else {
                                                    classes[0] = 0; 
                                                    classes[1] = 1; 
                                                }
                                            } else {
                                                classes[0] = 2; 
                                                classes[1] = 0; 
                                            }
                                        }
                                    } else {
                                        classes[0] = 6; 
                                        classes[1] = 0; 
                                    }
                                }
                            }
                        }
                    } else {
                        classes[0] = 0; 
                        classes[1] = 17; 
                    }
                } else {
                    if (features[2] <= 30.5) {
                        if (features[0] <= 0.5) {
                            classes[0] = 0; 
                            classes[1] = 1; 
                        } else {
                            if (features[2] <= 29.5) {
                                if (features[1] <= 43.900001525878906) {
                                    if (features[1] <= 39.55000305175781) {
                                        if (features[0] <= 4.5) {
                                            classes[0] = 4; 
                                            classes[1] = 0; 
                                        } else {
                                            classes[0] = 0; 
                                            classes[1] = 1; 
                                        }
                                    } else {
                                        classes[0] = 7; 
                                        classes[1] = 0; 
                                    }
                                } else {
                                    classes[0] = 0; 
                                    classes[1] = 1; 
                                }
                            } else {
                                classes[0] = 7; 
                                classes[1] = 0; 
                            }
                        }
                    } else {
                        if (features[0] <= 6.5) {
                            if (features[1] <= 36.900001525878906) {
                                classes[0] = 4; 
                                classes[1] = 0; 
                            } else {
                                if (features[1] <= 38.599998474121094) {
                                    if (features[2] <= 39.0) {
                                        classes[0] = 0; 
                                        classes[1] = 5; 
                                    } else {
                                        if (features[0] <= 5.5) {
                                            if (features[0] <= 3.0) {
                                                classes[0] = 1; 
                                                classes[1] = 0; 
                                            } else {
                                                classes[0] = 0; 
                                                classes[1] = 5; 
                                            }
                                        } else {
                                            classes[0] = 2; 
                                            classes[1] = 0; 
                                        }
                                    }
                                } else {
                                    if (features[2] <= 33.5) {
                                        if (features[0] <= 0.5) {
                                            if (features[1] <= 46.29999923706055) {
                                                classes[0] = 0; 
                                                classes[1] = 3; 
                                            } else {
                                                classes[0] = 1; 
                                                classes[1] = 0; 
                                            }
                                        } else {
                                            if (features[1] <= 42.650001525878906) {
                                                classes[0] = 0; 
                                                classes[1] = 2; 
                                            } else {
                                                classes[0] = 1; 
                                                classes[1] = 0; 
                                            }
                                        }
                                    } else {
                                        if (features[2] <= 53.5) {
                                            if (features[1] <= 39.45000076293945) {
                                                classes[0] = 6; 
                                                classes[1] = 0; 
                                            } else {
                                                if (features[1] <= 45.54999923706055) {
                                                    if (features[2] <= 50.0) {
                                                        if (features[2] <= 43.0) {
                                                            if (features[1] <= 43.349998474121094) {
                                                                if (features[2] <= 39.5) {
                                                                    classes[0] = 1; 
                                                                    classes[1] = 0; 
                                                                } else {
                                                                    classes[0] = 0; 
                                                                    classes[1] = 3; 
                                                                }
                                                            } else {
                                                                classes[0] = 1; 
                                                                classes[1] = 0; 
                                                            }
                                                        } else {
                                                            classes[0] = 5; 
                                                            classes[1] = 0; 
                                                        }
                                                    } else {
                                                        classes[0] = 0; 
                                                        classes[1] = 2; 
                                                    }
                                                } else {
                                                    classes[0] = 0; 
                                                    classes[1] = 2; 
                                                }
                                            }
                                        } else {
                                            classes[0] = 7; 
                                            classes[1] = 0; 
                                        }
                                    }
                                }
                            }
                        } else {
                            if (features[1] <= 37.5) {
                                if (features[1] <= 37.150001525878906) {
                                    if (features[0] <= 13.5) {
                                        classes[0] = 2; 
                                        classes[1] = 0; 
                                    } else {
                                        classes[0] = 0; 
                                        classes[1] = 3; 
                                    }
                                } else {
                                    classes[0] = 5; 
                                    classes[1] = 0; 
                                }
                            } else {
                                if (features[1] <= 38.45000076293945) {
                                    classes[0] = 0; 
                                    classes[1] = 7; 
                                } else {
                                    if (features[0] <= 10.5) {
                                        if (features[1] <= 39.05000305175781) {
                                            classes[0] = 2; 
                                            classes[1] = 0; 
                                        } else {
                                            classes[0] = 0; 
                                            classes[1] = 14; 
                                        }
                                    } else {
                                        if (features[1] <= 46.5) {
                                            if (features[2] <= 43.0) {
                                                if (features[0] <= 11.5) {
                                                    classes[0] = 2; 
                                                    classes[1] = 0; 
                                                } else {
                                                    if (features[0] <= 12.5) {
                                                        classes[0] = 0; 
                                                        classes[1] = 1; 
                                                    } else {
                                                        classes[0] = 1; 
                                                        classes[1] = 0; 
                                                    }
                                                }
                                            } else {
                                                if (features[1] <= 39.45000076293945) {
                                                    classes[0] = 1; 
                                                    classes[1] = 0; 
                                                } else {
                                                    classes[0] = 0; 
                                                    classes[1] = 3; 
                                                }
                                            }
                                        } else {
                                            classes[0] = 0; 
                                            classes[1] = 3; 
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        int class_idx = 0;
        int class_val = classes[0];
        for (int i = 1; i < 2; i++) {
            if (classes[i] > class_val) {
                class_idx = i;
                class_val = classes[i];
            }
        }
        return class_idx;
    }
    
    public static int predict_5(double[] features) {
        int[] classes = new int[2];
        
        if (features[0] <= 3.5) {
            if (features[1] <= 31.400001525878906) {
                if (features[0] <= 2.5) {
                    if (features[0] <= 0.5) {
                        if (features[2] <= 60.5) {
                            if (features[1] <= 30.049999237060547) {
                                classes[0] = 33; 
                                classes[1] = 0; 
                            } else {
                                if (features[1] <= 30.600000381469727) {
                                    if (features[2] <= 25.5) {
                                        classes[0] = 0; 
                                        classes[1] = 1; 
                                    } else {
                                        classes[0] = 1; 
                                        classes[1] = 0; 
                                    }
                                } else {
                                    classes[0] = 7; 
                                    classes[1] = 0; 
                                }
                            }
                        } else {
                            if (features[1] <= 24.899999618530273) {
                                classes[0] = 2; 
                                classes[1] = 0; 
                            } else {
                                classes[0] = 0; 
                                classes[1] = 2; 
                            }
                        }
                    } else {
                        if (features[0] <= 1.5) {
                            if (features[2] <= 39.0) {
                                if (features[2] <= 32.0) {
                                    classes[0] = 68; 
                                    classes[1] = 0; 
                                } else {
                                    if (features[2] <= 34.5) {
                                        classes[0] = 0; 
                                        classes[1] = 1; 
                                    } else {
                                        classes[0] = 3; 
                                        classes[1] = 0; 
                                    }
                                }
                            } else {
                                classes[0] = 0; 
                                classes[1] = 1; 
                            }
                        } else {
                            if (features[1] <= 26.100000381469727) {
                                classes[0] = 29; 
                                classes[1] = 0; 
                            } else {
                                if (features[2] <= 26.0) {
                                    classes[0] = 16; 
                                    classes[1] = 0; 
                                } else {
                                    if (features[2] <= 31.0) {
                                        if (features[1] <= 27.75) {
                                            classes[0] = 0; 
                                            classes[1] = 3; 
                                        } else {
                                            classes[0] = 2; 
                                            classes[1] = 0; 
                                        }
                                    } else {
                                        classes[0] = 2; 
                                        classes[1] = 0; 
                                    }
                                }
                            }
                        }
                    }
                } else {
                    if (features[2] <= 35.5) {
                        if (features[1] <= 29.799999237060547) {
                            if (features[1] <= 28.950000762939453) {
                                if (features[1] <= 28.0) {
                                    if (features[2] <= 23.5) {
                                        if (features[1] <= 24.549999237060547) {
                                            if (features[2] <= 22.5) {
                                                classes[0] = 2; 
                                                classes[1] = 0; 
                                            } else {
                                                if (features[1] <= 23.200000762939453) {
                                                    classes[0] = 0; 
                                                    classes[1] = 1; 
                                                } else {
                                                    classes[0] = 2; 
                                                    classes[1] = 0; 
                                                }
                                            }
                                        } else {
                                            classes[0] = 0; 
                                            classes[1] = 1; 
                                        }
                                    } else {
                                        classes[0] = 6; 
                                        classes[1] = 0; 
                                    }
                                } else {
                                    if (features[2] <= 31.5) {
                                        classes[0] = 2; 
                                        classes[1] = 0; 
                                    } else {
                                        classes[0] = 0; 
                                        classes[1] = 2; 
                                    }
                                }
                            } else {
                                classes[0] = 8; 
                                classes[1] = 0; 
                            }
                        } else {
                            if (features[2] <= 25.0) {
                                classes[0] = 3; 
                                classes[1] = 0; 
                            } else {
                                if (features[1] <= 30.450000762939453) {
                                    classes[0] = 0; 
                                    classes[1] = 2; 
                                } else {
                                    if (features[2] <= 30.0) {
                                        classes[0] = 0; 
                                        classes[1] = 1; 
                                    } else {
                                        classes[0] = 3; 
                                        classes[1] = 0; 
                                    }
                                }
                            }
                        }
                    } else {
                        classes[0] = 8; 
                        classes[1] = 0; 
                    }
                }
            } else {
                if (features[2] <= 30.5) {
                    if (features[1] <= 45.400001525878906) {
                        if (features[2] <= 28.5) {
                            if (features[2] <= 27.5) {
                                if (features[2] <= 25.5) {
                                    if (features[1] <= 33.25) {
                                        classes[0] = 14; 
                                        classes[1] = 0; 
                                    } else {
                                        if (features[2] <= 21.5) {
                                            if (features[0] <= 1.5) {
                                                if (features[0] <= 0.5) {
                                                    if (features[1] <= 35.19999694824219) {
                                                        classes[0] = 0; 
                                                        classes[1] = 1; 
                                                    } else {
                                                        if (features[1] <= 41.349998474121094) {
                                                            classes[0] = 3; 
                                                            classes[1] = 0; 
                                                        } else {
                                                            if (features[1] <= 42.79999923706055) {
                                                                classes[0] = 0; 
                                                                classes[1] = 1; 
                                                            } else {
                                                                classes[0] = 1; 
                                                                classes[1] = 0; 
                                                            }
                                                        }
                                                    }
                                                } else {
                                                    if (features[1] <= 34.69999694824219) {
                                                        classes[0] = 0; 
                                                        classes[1] = 2; 
                                                    } else {
                                                        classes[0] = 2; 
                                                        classes[1] = 0; 
                                                    }
                                                }
                                            } else {
                                                classes[0] = 4; 
                                                classes[1] = 0; 
                                            }
                                        } else {
                                            if (features[2] <= 22.5) {
                                                if (features[0] <= 2.5) {
                                                    if (features[1] <= 34.349998474121094) {
                                                        if (features[0] <= 0.5) {
                                                            classes[0] = 0; 
                                                            classes[1] = 4; 
                                                        } else {
                                                            classes[0] = 1; 
                                                            classes[1] = 0; 
                                                        }
                                                    } else {
                                                        if (features[0] <= 1.5) {
                                                            if (features[0] <= 0.5) {
                                                                if (features[1] <= 38.29999923706055) {
                                                                    classes[0] = 0; 
                                                                    classes[1] = 5; 
                                                                } else {
                                                                    classes[0] = 6; 
                                                                    classes[1] = 0; 
                                                                }
                                                            } else {
                                                                if (features[1] <= 38.599998474121094) {
                                                                    classes[0] = 4; 
                                                                    classes[1] = 0; 
                                                                } else {
                                                                    if (features[1] <= 41.20000076293945) {
                                                                        classes[0] = 0; 
                                                                        classes[1] = 2; 
                                                                    } else {
                                                                        if (features[1] <= 42.650001525878906) {
                                                                            classes[0] = 1; 
                                                                            classes[1] = 0; 
                                                                        } else {
                                                                            classes[0] = 0; 
                                                                            classes[1] = 2; 
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        } else {
                                                            classes[0] = 1; 
                                                            classes[1] = 0; 
                                                        }
                                                    }
                                                } else {
                                                    classes[0] = 0; 
                                                    classes[1] = 2; 
                                                }
                                            } else {
                                                if (features[2] <= 23.5) {
                                                    if (features[1] <= 38.099998474121094) {
                                                        if (features[0] <= 0.5) {
                                                            classes[0] = 0; 
                                                            classes[1] = 1; 
                                                        } else {
                                                            if (features[1] <= 35.79999923706055) {
                                                                classes[0] = 5; 
                                                                classes[1] = 0; 
                                                            } else {
                                                                classes[0] = 0; 
                                                                classes[1] = 1; 
                                                            }
                                                        }
                                                    } else {
                                                        classes[0] = 6; 
                                                        classes[1] = 0; 
                                                    }
                                                } else {
                                                    if (features[1] <= 40.25) {
                                                        if (features[2] <= 24.5) {
                                                            if (features[0] <= 2.5) {
                                                                classes[0] = 8; 
                                                                classes[1] = 0; 
                                                            } else {
                                                                classes[0] = 0; 
                                                                classes[1] = 4; 
                                                            }
                                                        } else {
                                                            if (features[0] <= 1.5) {
                                                                classes[0] = 5; 
                                                                classes[1] = 0; 
                                                            } else {
                                                                if (features[1] <= 35.45000076293945) {
                                                                    classes[0] = 1; 
                                                                    classes[1] = 0; 
                                                                } else {
                                                                    classes[0] = 0; 
                                                                    classes[1] = 4; 
                                                                }
                                                            }
                                                        }
                                                    } else {
                                                        if (features[1] <= 43.94999694824219) {
                                                            classes[0] = 0; 
                                                            classes[1] = 7; 
                                                        } else {
                                                            classes[0] = 3; 
                                                            classes[1] = 0; 
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                } else {
                                    if (features[0] <= 1.5) {
                                        classes[0] = 3; 
                                        classes[1] = 0; 
                                    } else {
                                        if (features[0] <= 2.5) {
                                            if (features[2] <= 26.5) {
                                                classes[0] = 7; 
                                                classes[1] = 0; 
                                            } else {
                                                if (features[1] <= 37.5) {
                                                    classes[0] = 6; 
                                                    classes[1] = 0; 
                                                } else {
                                                    if (features[1] <= 38.900001525878906) {
                                                        classes[0] = 0; 
                                                        classes[1] = 2; 
                                                    } else {
                                                        classes[0] = 1; 
                                                        classes[1] = 0; 
                                                    }
                                                }
                                            }
                                        } else {
                                            if (features[2] <= 26.5) {
                                                classes[0] = 2; 
                                                classes[1] = 0; 
                                            } else {
                                                if (features[1] <= 35.849998474121094) {
                                                    classes[0] = 0; 
                                                    classes[1] = 1; 
                                                } else {
                                                    classes[0] = 2; 
                                                    classes[1] = 0; 
                                                }
                                            }
                                        }
                                    }
                                }
                            } else {
                                if (features[1] <= 38.0) {
                                    if (features[0] <= 1.5) {
                                        classes[0] = 0; 
                                        classes[1] = 4; 
                                    } else {
                                        if (features[0] <= 2.5) {
                                            classes[0] = 1; 
                                            classes[1] = 0; 
                                        } else {
                                            if (features[1] <= 34.400001525878906) {
                                                classes[0] = 0; 
                                                classes[1] = 3; 
                                            } else {
                                                classes[0] = 1; 
                                                classes[1] = 0; 
                                            }
                                        }
                                    }
                                } else {
                                    if (features[1] <= 41.849998474121094) {
                                        classes[0] = 6; 
                                        classes[1] = 0; 
                                    } else {
                                        classes[0] = 0; 
                                        classes[1] = 1; 
                                    }
                                }
                            }
                        } else {
                            if (features[1] <= 36.599998474121094) {
                                if (features[2] <= 29.5) {
                                    classes[0] = 2; 
                                    classes[1] = 0; 
                                } else {
                                    classes[0] = 0; 
                                    classes[1] = 1; 
                                }
                            } else {
                                classes[0] = 11; 
                                classes[1] = 0; 
                            }
                        }
                    } else {
                        if (features[2] <= 24.0) {
                            if (features[1] <= 48.900001525878906) {
                                classes[0] = 0; 
                                classes[1] = 1; 
                            } else {
                                classes[0] = 2; 
                                classes[1] = 0; 
                            }
                        } else {
                            classes[0] = 0; 
                            classes[1] = 10; 
                        }
                    }
                } else {
                    if (features[1] <= 37.04999923706055) {
                        if (features[2] <= 38.5) {
                            classes[0] = 0; 
                            classes[1] = 15; 
                        } else {
                            if (features[1] <= 34.099998474121094) {
                                if (features[2] <= 44.5) {
                                    classes[0] = 5; 
                                    classes[1] = 0; 
                                } else {
                                    if (features[2] <= 48.5) {
                                        classes[0] = 1; 
                                        classes[1] = 3; 
                                    } else {
                                        classes[0] = 0; 
                                        classes[1] = 3; 
                                    }
                                }
                            } else {
                                classes[0] = 0; 
                                classes[1] = 3; 
                            }
                        }
                    } else {
                        if (features[0] <= 2.5) {
                            if (features[2] <= 31.5) {
                                if (features[1] <= 46.29999923706055) {
                                    classes[0] = 0; 
                                    classes[1] = 8; 
                                } else {
                                    if (features[1] <= 48.25) {
                                        classes[0] = 1; 
                                        classes[1] = 0; 
                                    } else {
                                        classes[0] = 0; 
                                        classes[1] = 3; 
                                    }
                                }
                            } else {
                                if (features[0] <= 0.5) {
                                    classes[0] = 4; 
                                    classes[1] = 0; 
                                } else {
                                    if (features[1] <= 44.69999694824219) {
                                        classes[0] = 6; 
                                        classes[1] = 0; 
                                    } else {
                                        if (features[1] <= 46.19999694824219) {
                                            classes[0] = 0; 
                                            classes[1] = 1; 
                                        } else {
                                            classes[0] = 1; 
                                            classes[1] = 0; 
                                        }
                                    }
                                }
                            }
                        } else {
                            classes[0] = 1; 
                            classes[1] = 0; 
                        }
                    }
                }
            }
        } else {
            if (features[0] <= 7.5) {
                if (features[1] <= 28.849998474121094) {
                    if (features[2] <= 28.5) {
                        classes[0] = 12; 
                        classes[1] = 0; 
                    } else {
                        if (features[2] <= 59.5) {
                            if (features[1] <= 26.350000381469727) {
                                if (features[0] <= 5.5) {
                                    if (features[2] <= 43.5) {
                                        classes[0] = 8; 
                                        classes[1] = 0; 
                                    } else {
                                        classes[0] = 0; 
                                        classes[1] = 1; 
                                    }
                                } else {
                                    if (features[2] <= 45.5) {
                                        classes[0] = 5; 
                                        classes[1] = 0; 
                                    } else {
                                        if (features[2] <= 55.0) {
                                            if (features[2] <= 50.5) {
                                                classes[0] = 0; 
                                                classes[1] = 1; 
                                            } else {
                                                classes[0] = 1; 
                                                classes[1] = 0; 
                                            }
                                        } else {
                                            classes[0] = 0; 
                                            classes[1] = 2; 
                                        }
                                    }
                                }
                            } else {
                                if (features[0] <= 5.5) {
                                    if (features[0] <= 4.5) {
                                        if (features[2] <= 33.5) {
                                            classes[0] = 1; 
                                            classes[1] = 0; 
                                        } else {
                                            if (features[2] <= 38.0) {
                                                classes[0] = 0; 
                                                classes[1] = 2; 
                                            } else {
                                                classes[0] = 1; 
                                                classes[1] = 0; 
                                            }
                                        }
                                    } else {
                                        classes[0] = 2; 
                                        classes[1] = 0; 
                                    }
                                } else {
                                    if (features[1] <= 28.150001525878906) {
                                        classes[0] = 0; 
                                        classes[1] = 5; 
                                    } else {
                                        classes[0] = 1; 
                                        classes[1] = 0; 
                                    }
                                }
                            }
                        } else {
                            classes[0] = 6; 
                            classes[1] = 0; 
                        }
                    }
                } else {
                    if (features[2] <= 51.5) {
                        if (features[0] <= 5.5) {
                            if (features[1] <= 33.0) {
                                if (features[0] <= 4.5) {
                                    if (features[2] <= 22.5) {
                                        classes[0] = 0; 
                                        classes[1] = 2; 
                                    } else {
                                        if (features[2] <= 30.5) {
                                            if (features[1] <= 32.849998474121094) {
                                                if (features[1] <= 31.049999237060547) {
                                                    if (features[1] <= 29.899999618530273) {
                                                        classes[0] = 1; 
                                                        classes[1] = 0; 
                                                    } else {
                                                        classes[0] = 0; 
                                                        classes[1] = 1; 
                                                    }
                                                } else {
                                                    if (features[1] <= 32.099998474121094) {
                                                        classes[0] = 3; 
                                                        classes[1] = 0; 
                                                    } else {
                                                        if (features[2] <= 25.0) {
                                                            classes[0] = 1; 
                                                            classes[1] = 0; 
                                                        } else {
                                                            classes[0] = 0; 
                                                            classes[1] = 1; 
                                                        }
                                                    }
                                                }
                                            } else {
                                                classes[0] = 0; 
                                                classes[1] = 1; 
                                            }
                                        } else {
                                            if (features[2] <= 32.0) {
                                                classes[0] = 0; 
                                                classes[1] = 5; 
                                            } else {
                                                if (features[2] <= 41.0) {
                                                    if (features[2] <= 35.5) {
                                                        if (features[1] <= 29.5) {
                                                            classes[0] = 1; 
                                                            classes[1] = 0; 
                                                        } else {
                                                            if (features[2] <= 34.5) {
                                                                if (features[1] <= 30.850000381469727) {
                                                                    classes[0] = 0; 
                                                                    classes[1] = 2; 
                                                                } else {
                                                                    classes[0] = 2; 
                                                                    classes[1] = 0; 
                                                                }
                                                            } else {
                                                                classes[0] = 0; 
                                                                classes[1] = 2; 
                                                            }
                                                        }
                                                    } else {
                                                        classes[0] = 2; 
                                                        classes[1] = 0; 
                                                    }
                                                } else {
                                                    classes[0] = 0; 
                                                    classes[1] = 2; 
                                                }
                                            }
                                        }
                                    }
                                } else {
                                    classes[0] = 0; 
                                    classes[1] = 2; 
                                }
                            } else {
                                if (features[2] <= 40.0) {
                                    if (features[2] <= 31.5) {
                                        if (features[1] <= 36.849998474121094) {
                                            classes[0] = 14; 
                                            classes[1] = 0; 
                                        } else {
                                            if (features[0] <= 4.5) {
                                                if (features[1] <= 37.29999923706055) {
                                                    classes[0] = 0; 
                                                    classes[1] = 2; 
                                                } else {
                                                    if (features[2] <= 26.0) {
                                                        classes[0] = 0; 
                                                        classes[1] = 2; 
                                                    } else {
                                                        classes[0] = 2; 
                                                        classes[1] = 0; 
                                                    }
                                                }
                                            } else {
                                                classes[0] = 0; 
                                                classes[1] = 3; 
                                            }
                                        }
                                    } else {
                                        if (features[0] <= 4.5) {
                                            classes[0] = 0; 
                                            classes[1] = 3; 
                                        } else {
                                            if (features[2] <= 34.0) {
                                                classes[0] = 2; 
                                                classes[1] = 0; 
                                            } else {
                                                if (features[2] <= 37.5) {
                                                    classes[0] = 0; 
                                                    classes[1] = 2; 
                                                } else {
                                                    if (features[1] <= 34.04999923706055) {
                                                        classes[0] = 0; 
                                                        classes[1] = 1; 
                                                    } else {
                                                        classes[0] = 2; 
                                                        classes[1] = 0; 
                                                    }
                                                }
                                            }
                                        }
                                    }
                                } else {
                                    classes[0] = 7; 
                                    classes[1] = 0; 
                                }
                            }
                        } else {
                            if (features[2] <= 28.5) {
                                classes[0] = 5; 
                                classes[1] = 0; 
                            } else {
                                if (features[0] <= 6.5) {
                                    if (features[2] <= 48.0) {
                                        if (features[1] <= 29.849998474121094) {
                                            classes[0] = 3; 
                                            classes[1] = 0; 
                                        } else {
                                            if (features[2] <= 43.0) {
                                                if (features[2] <= 37.0) {
                                                    if (features[2] <= 32.5) {
                                                        if (features[1] <= 36.099998474121094) {
                                                            classes[0] = 0; 
                                                            classes[1] = 4; 
                                                        } else {
                                                            classes[0] = 1; 
                                                            classes[1] = 0; 
                                                        }
                                                    } else {
                                                        classes[0] = 1; 
                                                        classes[1] = 0; 
                                                    }
                                                } else {
                                                    classes[0] = 0; 
                                                    classes[1] = 6; 
                                                }
                                            } else {
                                                if (features[2] <= 45.5) {
                                                    classes[0] = 1; 
                                                    classes[1] = 0; 
                                                } else {
                                                    if (features[1] <= 39.099998474121094) {
                                                        classes[0] = 3; 
                                                        classes[1] = 0; 
                                                    } else {
                                                        classes[0] = 0; 
                                                        classes[1] = 2; 
                                                    }
                                                }
                                            }
                                        }
                                    } else {
                                        classes[0] = 0; 
                                        classes[1] = 3; 
                                    }
                                } else {
                                    if (features[1] <= 29.950000762939453) {
                                        if (features[2] <= 40.5) {
                                            classes[0] = 0; 
                                            classes[1] = 1; 
                                        } else {
                                            classes[0] = 3; 
                                            classes[1] = 0; 
                                        }
                                    } else {
                                        if (features[2] <= 41.5) {
                                            if (features[1] <= 34.400001525878906) {
                                                if (features[2] <= 40.0) {
                                                    if (features[1] <= 31.450000762939453) {
                                                        classes[0] = 0; 
                                                        classes[1] = 3; 
                                                    } else {
                                                        classes[0] = 1; 
                                                        classes[1] = 0; 
                                                    }
                                                } else {
                                                    classes[0] = 2; 
                                                    classes[1] = 0; 
                                                }
                                            } else {
                                                if (features[1] <= 39.650001525878906) {
                                                    classes[0] = 0; 
                                                    classes[1] = 8; 
                                                } else {
                                                    if (features[2] <= 36.5) {
                                                        classes[0] = 0; 
                                                        classes[1] = 2; 
                                                    } else {
                                                        classes[0] = 1; 
                                                        classes[1] = 0; 
                                                    }
                                                }
                                            }
                                        } else {
                                            if (features[2] <= 42.5) {
                                                classes[0] = 3; 
                                                classes[1] = 0; 
                                            } else {
                                                if (features[2] <= 44.0) {
                                                    classes[0] = 0; 
                                                    classes[1] = 2; 
                                                } else {
                                                    if (features[1] <= 33.79999923706055) {
                                                        classes[0] = 0; 
                                                        classes[1] = 1; 
                                                    } else {
                                                        classes[0] = 5; 
                                                        classes[1] = 0; 
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    } else {
                        if (features[0] <= 6.5) {
                            if (features[2] <= 62.0) {
                                classes[0] = 0; 
                                classes[1] = 11; 
                            } else {
                                if (features[1] <= 31.149999618530273) {
                                    classes[0] = 1; 
                                    classes[1] = 0; 
                                } else {
                                    if (features[1] <= 33.099998474121094) {
                                        classes[0] = 0; 
                                        classes[1] = 2; 
                                    } else {
                                        if (features[0] <= 4.5) {
                                            classes[0] = 0; 
                                            classes[1] = 1; 
                                        } else {
                                            if (features[1] <= 34.599998474121094) {
                                                classes[0] = 1; 
                                                classes[1] = 0; 
                                            } else {
                                                classes[0] = 0; 
                                                classes[1] = 1; 
                                            }
                                        }
                                    }
                                }
                            }
                        } else {
                            if (features[1] <= 34.70000076293945) {
                                classes[0] = 1; 
                                classes[1] = 0; 
                            } else {
                                classes[0] = 0; 
                                classes[1] = 1; 
                            }
                        }
                    }
                }
            } else {
                if (features[2] <= 56.5) {
                    if (features[2] <= 48.5) {
                        if (features[1] <= 39.05000305175781) {
                            if (features[2] <= 46.5) {
                                if (features[0] <= 9.5) {
                                    if (features[2] <= 33.5) {
                                        classes[0] = 0; 
                                        classes[1] = 13; 
                                    } else {
                                        if (features[0] <= 8.5) {
                                            if (features[1] <= 37.94999694824219) {
                                                if (features[2] <= 35.0) {
                                                    classes[0] = 2; 
                                                    classes[1] = 0; 
                                                } else {
                                                    if (features[1] <= 29.150001525878906) {
                                                        classes[0] = 1; 
                                                        classes[1] = 2; 
                                                    } else {
                                                        if (features[2] <= 40.0) {
                                                            if (features[2] <= 38.0) {
                                                                classes[0] = 0; 
                                                                classes[1] = 5; 
                                                            } else {
                                                                if (features[1] <= 34.099998474121094) {
                                                                    classes[0] = 0; 
                                                                    classes[1] = 2; 
                                                                } else {
                                                                    classes[0] = 1; 
                                                                    classes[1] = 0; 
                                                                }
                                                            }
                                                        } else {
                                                            classes[0] = 0; 
                                                            classes[1] = 8; 
                                                        }
                                                    }
                                                }
                                            } else {
                                                classes[0] = 4; 
                                                classes[1] = 0; 
                                            }
                                        } else {
                                            if (features[1] <= 31.950000762939453) {
                                                classes[0] = 3; 
                                                classes[1] = 0; 
                                            } else {
                                                if (features[2] <= 41.5) {
                                                    if (features[1] <= 35.5) {
                                                        classes[0] = 3; 
                                                        classes[1] = 0; 
                                                    } else {
                                                        classes[0] = 0; 
                                                        classes[1] = 1; 
                                                    }
                                                } else {
                                                    classes[0] = 0; 
                                                    classes[1] = 8; 
                                                }
                                            }
                                        }
                                    }
                                } else {
                                    if (features[1] <= 34.44999694824219) {
                                        if (features[0] <= 13.5) {
                                            if (features[2] <= 39.5) {
                                                classes[0] = 5; 
                                                classes[1] = 0; 
                                            } else {
                                                if (features[1] <= 32.599998474121094) {
                                                    if (features[0] <= 10.5) {
                                                        if (features[1] <= 29.350000381469727) {
                                                            classes[0] = 2; 
                                                            classes[1] = 0; 
                                                        } else {
                                                            if (features[1] <= 31.150001525878906) {
                                                                classes[0] = 0; 
                                                                classes[1] = 2; 
                                                            } else {
                                                                if (features[2] <= 41.5) {
                                                                    classes[0] = 1; 
                                                                    classes[1] = 0; 
                                                                } else {
                                                                    classes[0] = 0; 
                                                                    classes[1] = 2; 
                                                                }
                                                            }
                                                        }
                                                    } else {
                                                        if (features[2] <= 43.0) {
                                                            classes[0] = 0; 
                                                            classes[1] = 2; 
                                                        } else {
                                                            if (features[2] <= 45.0) {
                                                                if (features[1] <= 25.600000381469727) {
                                                                    classes[0] = 1; 
                                                                    classes[1] = 0; 
                                                                } else {
                                                                    classes[0] = 0; 
                                                                    classes[1] = 1; 
                                                                }
                                                            } else {
                                                                classes[0] = 0; 
                                                                classes[1] = 1; 
                                                            }
                                                        }
                                                    }
                                                } else {
                                                    classes[0] = 2; 
                                                    classes[1] = 0; 
                                                }
                                            }
                                        } else {
                                            classes[0] = 0; 
                                            classes[1] = 2; 
                                        }
                                    } else {
                                        classes[0] = 6; 
                                        classes[1] = 0; 
                                    }
                                }
                            } else {
                                classes[0] = 5; 
                                classes[1] = 0; 
                            }
                        } else {
                            if (features[2] <= 42.5) {
                                if (features[1] <= 45.900001525878906) {
                                    classes[0] = 0; 
                                    classes[1] = 6; 
                                } else {
                                    if (features[1] <= 49.25) {
                                        classes[0] = 1; 
                                        classes[1] = 0; 
                                    } else {
                                        classes[0] = 0; 
                                        classes[1] = 2; 
                                    }
                                }
                            } else {
                                classes[0] = 0; 
                                classes[1] = 10; 
                            }
                        }
                    } else {
                        if (features[0] <= 8.5) {
                            if (features[2] <= 52.0) {
                                classes[0] = 1; 
                                classes[1] = 0; 
                            } else {
                                classes[0] = 0; 
                                classes[1] = 1; 
                            }
                        } else {
                            if (features[2] <= 55.0) {
                                classes[0] = 0; 
                                classes[1] = 13; 
                            } else {
                                if (features[1] <= 29.0) {
                                    classes[0] = 1; 
                                    classes[1] = 0; 
                                } else {
                                    classes[0] = 0; 
                                    classes[1] = 1; 
                                }
                            }
                        }
                    }
                } else {
                    if (features[1] <= 28.950000762939453) {
                        classes[0] = 10; 
                        classes[1] = 0; 
                    } else {
                        if (features[0] <= 10.0) {
                            if (features[2] <= 58.5) {
                                classes[0] = 2; 
                                classes[1] = 0; 
                            } else {
                                classes[0] = 0; 
                                classes[1] = 3; 
                            }
                        } else {
                            classes[0] = 0; 
                            classes[1] = 1; 
                        }
                    }
                }
            }
        }
        int class_idx = 0;
        int class_val = classes[0];
        for (int i = 1; i < 2; i++) {
            if (classes[i] > class_val) {
                class_idx = i;
                class_val = classes[i];
            }
        }
        return class_idx;
    }
    
    public static int predict_6(double[] features) {
        int[] classes = new int[2];
        
        if (features[1] <= 29.849998474121094) {
            if (features[2] <= 27.5) {
                if (features[1] <= 25.5) {
                    if (features[1] <= 22.700000762939453) {
                        classes[0] = 44; 
                        classes[1] = 0; 
                    } else {
                        if (features[2] <= 22.5) {
                            classes[0] = 26; 
                            classes[1] = 0; 
                        } else {
                            if (features[2] <= 23.5) {
                                if (features[1] <= 23.200000762939453) {
                                    classes[0] = 0; 
                                    classes[1] = 1; 
                                } else {
                                    classes[0] = 3; 
                                    classes[1] = 0; 
                                }
                            } else {
                                classes[0] = 12; 
                                classes[1] = 0; 
                            }
                        }
                    }
                } else {
                    if (features[0] <= 6.5) {
                        if (features[0] <= 1.5) {
                            classes[0] = 30; 
                            classes[1] = 0; 
                        } else {
                            if (features[1] <= 25.700000762939453) {
                                classes[0] = 0; 
                                classes[1] = 2; 
                            } else {
                                if (features[1] <= 28.799999237060547) {
                                    classes[0] = 18; 
                                    classes[1] = 0; 
                                } else {
                                    if (features[0] <= 2.5) {
                                        if (features[1] <= 28.950000762939453) {
                                            classes[0] = 0; 
                                            classes[1] = 2; 
                                        } else {
                                            classes[0] = 5; 
                                            classes[1] = 0; 
                                        }
                                    } else {
                                        classes[0] = 5; 
                                        classes[1] = 0; 
                                    }
                                }
                            }
                        }
                    } else {
                        classes[0] = 0; 
                        classes[1] = 1; 
                    }
                }
            } else {
                if (features[2] <= 53.5) {
                    if (features[1] <= 26.299999237060547) {
                        if (features[2] <= 49.0) {
                            if (features[2] <= 33.5) {
                                if (features[1] <= 23.700000762939453) {
                                    if (features[1] <= 23.25) {
                                        if (features[0] <= 8.0) {
                                            classes[0] = 4; 
                                            classes[1] = 0; 
                                        } else {
                                            classes[0] = 0; 
                                            classes[1] = 1; 
                                        }
                                    } else {
                                        classes[0] = 0; 
                                        classes[1] = 4; 
                                    }
                                } else {
                                    classes[0] = 12; 
                                    classes[1] = 0; 
                                }
                            } else {
                                classes[0] = 21; 
                                classes[1] = 0; 
                            }
                        } else {
                            if (features[1] <= 25.399999618530273) {
                                classes[0] = 0; 
                                classes[1] = 3; 
                            } else {
                                classes[0] = 1; 
                                classes[1] = 0; 
                            }
                        }
                    } else {
                        if (features[2] <= 49.0) {
                            if (features[0] <= 6.5) {
                                if (features[0] <= 0.5) {
                                    classes[0] = 4; 
                                    classes[1] = 0; 
                                } else {
                                    if (features[2] <= 29.5) {
                                        if (features[1] <= 27.700000762939453) {
                                            classes[0] = 0; 
                                            classes[1] = 3; 
                                        } else {
                                            if (features[1] <= 27.899999618530273) {
                                                classes[0] = 1; 
                                                classes[1] = 0; 
                                            } else {
                                                if (features[1] <= 28.200000762939453) {
                                                    classes[0] = 0; 
                                                    classes[1] = 1; 
                                                } else {
                                                    classes[0] = 1; 
                                                    classes[1] = 0; 
                                                }
                                            }
                                        }
                                    } else {
                                        if (features[2] <= 40.5) {
                                            if (features[1] <= 29.149999618530273) {
                                                if (features[0] <= 4.5) {
                                                    if (features[1] <= 28.200000762939453) {
                                                        classes[0] = 4; 
                                                        classes[1] = 0; 
                                                    } else {
                                                        classes[0] = 0; 
                                                        classes[1] = 1; 
                                                    }
                                                } else {
                                                    if (features[2] <= 31.0) {
                                                        classes[0] = 1; 
                                                        classes[1] = 0; 
                                                    } else {
                                                        if (features[0] <= 5.5) {
                                                            classes[0] = 0; 
                                                            classes[1] = 1; 
                                                        } else {
                                                            if (features[1] <= 27.0) {
                                                                classes[0] = 1; 
                                                                classes[1] = 0; 
                                                            } else {
                                                                classes[0] = 0; 
                                                                classes[1] = 1; 
                                                            }
                                                        }
                                                    }
                                                }
                                            } else {
                                                if (features[1] <= 29.650001525878906) {
                                                    classes[0] = 8; 
                                                    classes[1] = 0; 
                                                } else {
                                                    if (features[2] <= 31.5) {
                                                        classes[0] = 0; 
                                                        classes[1] = 1; 
                                                    } else {
                                                        classes[0] = 3; 
                                                        classes[1] = 0; 
                                                    }
                                                }
                                            }
                                        } else {
                                            if (features[1] <= 28.849998474121094) {
                                                classes[0] = 2; 
                                                classes[1] = 0; 
                                            } else {
                                                classes[0] = 0; 
                                                classes[1] = 4; 
                                            }
                                        }
                                    }
                                }
                            } else {
                                if (features[2] <= 35.0) {
                                    classes[0] = 0; 
                                    classes[1] = 8; 
                                } else {
                                    if (features[2] <= 38.0) {
                                        classes[0] = 4; 
                                        classes[1] = 0; 
                                    } else {
                                        if (features[0] <= 8.5) {
                                            classes[0] = 1; 
                                            classes[1] = 0; 
                                        } else {
                                            classes[0] = 0; 
                                            classes[1] = 5; 
                                        }
                                    }
                                }
                            }
                        } else {
                            classes[0] = 0; 
                            classes[1] = 5; 
                        }
                    }
                } else {
                    if (features[1] <= 22.850000381469727) {
                        classes[0] = 7; 
                        classes[1] = 0; 
                    } else {
                        if (features[2] <= 62.5) {
                            if (features[2] <= 61.5) {
                                if (features[0] <= 6.5) {
                                    if (features[1] <= 24.0) {
                                        classes[0] = 0; 
                                        classes[1] = 2; 
                                    } else {
                                        classes[0] = 3; 
                                        classes[1] = 0; 
                                    }
                                } else {
                                    if (features[1] <= 26.400001525878906) {
                                        if (features[2] <= 56.5) {
                                            classes[0] = 0; 
                                            classes[1] = 1; 
                                        } else {
                                            classes[0] = 2; 
                                            classes[1] = 0; 
                                        }
                                    } else {
                                        classes[0] = 5; 
                                        classes[1] = 0; 
                                    }
                                }
                            } else {
                                if (features[0] <= 0.5) {
                                    classes[0] = 0; 
                                    classes[1] = 2; 
                                } else {
                                    classes[0] = 2; 
                                    classes[1] = 0; 
                                }
                            }
                        } else {
                            classes[0] = 5; 
                            classes[1] = 0; 
                        }
                    }
                }
            }
        } else {
            if (features[0] <= 5.5) {
                if (features[1] <= 47.54999923706055) {
                    if (features[0] <= 2.5) {
                        if (features[0] <= 1.5) {
                            if (features[1] <= 44.150001525878906) {
                                if (features[1] <= 41.75) {
                                    if (features[1] <= 40.04999923706055) {
                                        if (features[0] <= 0.5) {
                                            if (features[2] <= 30.5) {
                                                if (features[2] <= 21.5) {
                                                    if (features[1] <= 33.5) {
                                                        classes[0] = 5; 
                                                        classes[1] = 0; 
                                                    } else {
                                                        if (features[1] <= 35.19999694824219) {
                                                            classes[0] = 0; 
                                                            classes[1] = 1; 
                                                        } else {
                                                            classes[0] = 3; 
                                                            classes[1] = 0; 
                                                        }
                                                    }
                                                } else {
                                                    if (features[1] <= 33.400001525878906) {
                                                        if (features[1] <= 31.399999618530273) {
                                                            classes[0] = 4; 
                                                            classes[1] = 0; 
                                                        } else {
                                                            if (features[2] <= 25.5) {
                                                                if (features[2] <= 23.0) {
                                                                    if (features[1] <= 32.599998474121094) {
                                                                        classes[0] = 0; 
                                                                        classes[1] = 1; 
                                                                    } else {
                                                                        classes[0] = 2; 
                                                                        classes[1] = 0; 
                                                                    }
                                                                } else {
                                                                    classes[0] = 0; 
                                                                    classes[1] = 1; 
                                                                }
                                                            } else {
                                                                classes[0] = 2; 
                                                                classes[1] = 0; 
                                                            }
                                                        }
                                                    } else {
                                                        if (features[1] <= 34.599998474121094) {
                                                            classes[0] = 0; 
                                                            classes[1] = 5; 
                                                        } else {
                                                            if (features[1] <= 36.04999923706055) {
                                                                classes[0] = 5; 
                                                                classes[1] = 0; 
                                                            } else {
                                                                if (features[1] <= 38.05000305175781) {
                                                                    if (features[2] <= 24.5) {
                                                                        classes[0] = 0; 
                                                                        classes[1] = 4; 
                                                                    } else {
                                                                        if (features[1] <= 36.69999694824219) {
                                                                            classes[0] = 0; 
                                                                            classes[1] = 4; 
                                                                        } else {
                                                                            if (features[1] <= 37.349998474121094) {
                                                                                classes[0] = 2; 
                                                                                classes[1] = 0; 
                                                                            } else {
                                                                                classes[0] = 0; 
                                                                                classes[1] = 2; 
                                                                            }
                                                                        }
                                                                    }
                                                                } else {
                                                                    classes[0] = 2; 
                                                                    classes[1] = 0; 
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            } else {
                                                classes[0] = 0; 
                                                classes[1] = 5; 
                                            }
                                        } else {
                                            if (features[2] <= 28.5) {
                                                if (features[1] <= 38.79999923706055) {
                                                    classes[0] = 28; 
                                                    classes[1] = 0; 
                                                } else {
                                                    classes[0] = 0; 
                                                    classes[1] = 2; 
                                                }
                                            } else {
                                                if (features[1] <= 37.44999694824219) {
                                                    if (features[1] <= 33.44999694824219) {
                                                        if (features[1] <= 32.400001525878906) {
                                                            classes[0] = 0; 
                                                            classes[1] = 5; 
                                                        } else {
                                                            if (features[2] <= 47.5) {
                                                                classes[0] = 0; 
                                                                classes[1] = 1; 
                                                            } else {
                                                                classes[0] = 2; 
                                                                classes[1] = 0; 
                                                            }
                                                        }
                                                    } else {
                                                        classes[0] = 0; 
                                                        classes[1] = 12; 
                                                    }
                                                } else {
                                                    if (features[1] <= 38.95000076293945) {
                                                        classes[0] = 3; 
                                                        classes[1] = 0; 
                                                    } else {
                                                        classes[0] = 0; 
                                                        classes[1] = 2; 
                                                    }
                                                }
                                            }
                                        }
                                    } else {
                                        if (features[2] <= 27.0) {
                                            classes[0] = 8; 
                                            classes[1] = 0; 
                                        } else {
                                            if (features[1] <= 40.900001525878906) {
                                                classes[0] = 3; 
                                                classes[1] = 0; 
                                            } else {
                                                if (features[2] <= 28.5) {
                                                    if (features[0] <= 0.5) {
                                                        classes[0] = 0; 
                                                        classes[1] = 1; 
                                                    } else {
                                                        classes[0] = 3; 
                                                        classes[1] = 0; 
                                                    }
                                                } else {
                                                    classes[0] = 1; 
                                                    classes[1] = 0; 
                                                }
                                            }
                                        }
                                    }
                                } else {
                                    if (features[1] <= 43.25) {
                                        classes[0] = 0; 
                                        classes[1] = 7; 
                                    } else {
                                        if (features[1] <= 43.79999923706055) {
                                            if (features[0] <= 0.5) {
                                                if (features[2] <= 23.5) {
                                                    classes[0] = 1; 
                                                    classes[1] = 0; 
                                                } else {
                                                    classes[0] = 0; 
                                                    classes[1] = 1; 
                                                }
                                            } else {
                                                if (features[2] <= 37.0) {
                                                    classes[0] = 1; 
                                                    classes[1] = 0; 
                                                } else {
                                                    classes[0] = 0; 
                                                    classes[1] = 1; 
                                                }
                                            }
                                        } else {
                                            classes[0] = 0; 
                                            classes[1] = 1; 
                                        }
                                    }
                                }
                            } else {
                                if (features[2] <= 39.0) {
                                    classes[0] = 7; 
                                    classes[1] = 0; 
                                } else {
                                    if (features[1] <= 45.69999694824219) {
                                        classes[0] = 2; 
                                        classes[1] = 0; 
                                    } else {
                                        classes[0] = 0; 
                                        classes[1] = 1; 
                                    }
                                }
                            }
                        } else {
                            if (features[1] <= 42.80000305175781) {
                                if (features[2] <= 58.0) {
                                    if (features[2] <= 26.5) {
                                        if (features[1] <= 31.900001525878906) {
                                            if (features[1] <= 31.200000762939453) {
                                                classes[0] = 3; 
                                                classes[1] = 0; 
                                            } else {
                                                classes[0] = 0; 
                                                classes[1] = 1; 
                                            }
                                        } else {
                                            classes[0] = 23; 
                                            classes[1] = 0; 
                                        }
                                    } else {
                                        if (features[2] <= 53.5) {
                                            if (features[1] <= 38.30000305175781) {
                                                if (features[2] <= 28.5) {
                                                    if (features[2] <= 27.5) {
                                                        if (features[1] <= 37.5) {
                                                            classes[0] = 2; 
                                                            classes[1] = 0; 
                                                        } else {
                                                            classes[0] = 0; 
                                                            classes[1] = 2; 
                                                        }
                                                    } else {
                                                        classes[0] = 1; 
                                                        classes[1] = 0; 
                                                    }
                                                } else {
                                                    if (features[2] <= 36.0) {
                                                        classes[0] = 0; 
                                                        classes[1] = 2; 
                                                    } else {
                                                        if (features[2] <= 47.5) {
                                                            classes[0] = 1; 
                                                            classes[1] = 0; 
                                                        } else {
                                                            classes[0] = 0; 
                                                            classes[1] = 1; 
                                                        }
                                                    }
                                                }
                                            } else {
                                                classes[0] = 7; 
                                                classes[1] = 0; 
                                            }
                                        } else {
                                            classes[0] = 2; 
                                            classes[1] = 0; 
                                        }
                                    }
                                } else {
                                    classes[0] = 0; 
                                    classes[1] = 3; 
                                }
                            } else {
                                classes[0] = 0; 
                                classes[1] = 2; 
                            }
                        }
                    } else {
                        if (features[0] <= 3.5) {
                            if (features[1] <= 36.80000305175781) {
                                if (features[1] <= 33.25) {
                                    if (features[2] <= 26.5) {
                                        if (features[1] <= 31.75) {
                                            if (features[2] <= 24.5) {
                                                classes[0] = 1; 
                                                classes[1] = 0; 
                                            } else {
                                                classes[0] = 0; 
                                                classes[1] = 1; 
                                            }
                                        } else {
                                            classes[0] = 9; 
                                            classes[1] = 0; 
                                        }
                                    } else {
                                        if (features[1] <= 32.0) {
                                            if (features[2] <= 31.5) {
                                                if (features[2] <= 27.5) {
                                                    classes[0] = 0; 
                                                    classes[1] = 2; 
                                                } else {
                                                    if (features[1] <= 31.049999237060547) {
                                                        classes[0] = 0; 
                                                        classes[1] = 2; 
                                                    } else {
                                                        classes[0] = 2; 
                                                        classes[1] = 3; 
                                                    }
                                                }
                                            } else {
                                                classes[0] = 1; 
                                                classes[1] = 0; 
                                            }
                                        } else {
                                            classes[0] = 0; 
                                            classes[1] = 6; 
                                        }
                                    }
                                } else {
                                    if (features[2] <= 28.5) {
                                        if (features[2] <= 25.5) {
                                            classes[0] = 0; 
                                            classes[1] = 5; 
                                        } else {
                                            classes[0] = 1; 
                                            classes[1] = 0; 
                                        }
                                    } else {
                                        classes[0] = 0; 
                                        classes[1] = 12; 
                                    }
                                }
                            } else {
                                classes[0] = 8; 
                                classes[1] = 0; 
                            }
                        } else {
                            if (features[2] <= 49.5) {
                                if (features[1] <= 33.0) {
                                    if (features[0] <= 4.5) {
                                        if (features[1] <= 31.049999237060547) {
                                            classes[0] = 0; 
                                            classes[1] = 3; 
                                        } else {
                                            if (features[2] <= 32.0) {
                                                if (features[1] <= 31.950000762939453) {
                                                    classes[0] = 2; 
                                                    classes[1] = 0; 
                                                } else {
                                                    classes[0] = 0; 
                                                    classes[1] = 6; 
                                                }
                                            } else {
                                                if (features[2] <= 34.5) {
                                                    classes[0] = 2; 
                                                    classes[1] = 0; 
                                                } else {
                                                    if (features[2] <= 36.0) {
                                                        classes[0] = 0; 
                                                        classes[1] = 1; 
                                                    } else {
                                                        classes[0] = 2; 
                                                        classes[1] = 0; 
                                                    }
                                                }
                                            }
                                        }
                                    } else {
                                        if (features[1] <= 31.25) {
                                            classes[0] = 1; 
                                            classes[1] = 0; 
                                        } else {
                                            classes[0] = 0; 
                                            classes[1] = 3; 
                                        }
                                    }
                                } else {
                                    if (features[0] <= 4.5) {
                                        if (features[1] <= 38.099998474121094) {
                                            if (features[1] <= 34.900001525878906) {
                                                if (features[2] <= 25.0) {
                                                    classes[0] = 4; 
                                                    classes[1] = 0; 
                                                } else {
                                                    if (features[1] <= 33.94999694824219) {
                                                        classes[0] = 3; 
                                                        classes[1] = 0; 
                                                    } else {
                                                        classes[0] = 0; 
                                                        classes[1] = 1; 
                                                    }
                                                }
                                            } else {
                                                classes[0] = 13; 
                                                classes[1] = 0; 
                                            }
                                        } else {
                                            if (features[2] <= 37.5) {
                                                if (features[1] <= 39.0) {
                                                    classes[0] = 0; 
                                                    classes[1] = 3; 
                                                } else {
                                                    if (features[1] <= 43.099998474121094) {
                                                        classes[0] = 3; 
                                                        classes[1] = 0; 
                                                    } else {
                                                        if (features[1] <= 44.25) {
                                                            classes[0] = 0; 
                                                            classes[1] = 1; 
                                                        } else {
                                                            classes[0] = 1; 
                                                            classes[1] = 0; 
                                                        }
                                                    }
                                                }
                                            } else {
                                                classes[0] = 3; 
                                                classes[1] = 0; 
                                            }
                                        }
                                    } else {
                                        if (features[1] <= 38.900001525878906) {
                                            if (features[1] <= 36.79999923706055) {
                                                classes[0] = 10; 
                                                classes[1] = 0; 
                                            } else {
                                                if (features[1] <= 38.25) {
                                                    classes[0] = 0; 
                                                    classes[1] = 1; 
                                                } else {
                                                    classes[0] = 4; 
                                                    classes[1] = 0; 
                                                }
                                            }
                                        } else {
                                            if (features[2] <= 39.5) {
                                                classes[0] = 0; 
                                                classes[1] = 3; 
                                            } else {
                                                classes[0] = 4; 
                                                classes[1] = 0; 
                                            }
                                        }
                                    }
                                }
                            } else {
                                if (features[1] <= 34.650001525878906) {
                                    if (features[2] <= 63.0) {
                                        classes[0] = 0; 
                                        classes[1] = 1; 
                                    } else {
                                        classes[0] = 1; 
                                        classes[1] = 0; 
                                    }
                                } else {
                                    if (features[2] <= 58.0) {
                                        classes[0] = 0; 
                                        classes[1] = 7; 
                                    } else {
                                        classes[0] = 1; 
                                        classes[1] = 0; 
                                    }
                                }
                            }
                        }
                    }
                } else {
                    classes[0] = 0; 
                    classes[1] = 12; 
                }
            } else {
                if (features[1] <= 39.04999923706055) {
                    if (features[0] <= 9.5) {
                        if (features[0] <= 8.5) {
                            if (features[2] <= 28.5) {
                                classes[0] = 3; 
                                classes[1] = 0; 
                            } else {
                                if (features[0] <= 7.5) {
                                    if (features[0] <= 6.5) {
                                        if (features[2] <= 43.5) {
                                            classes[0] = 0; 
                                            classes[1] = 7; 
                                        } else {
                                            if (features[2] <= 49.5) {
                                                classes[0] = 2; 
                                                classes[1] = 0; 
                                            } else {
                                                if (features[2] <= 54.5) {
                                                    classes[0] = 0; 
                                                    classes[1] = 3; 
                                                } else {
                                                    classes[0] = 1; 
                                                    classes[1] = 0; 
                                                }
                                            }
                                        }
                                    } else {
                                        if (features[1] <= 29.950000762939453) {
                                            classes[0] = 1; 
                                            classes[1] = 0; 
                                        } else {
                                            if (features[1] <= 31.25) {
                                                classes[0] = 0; 
                                                classes[1] = 9; 
                                            } else {
                                                if (features[1] <= 32.599998474121094) {
                                                    classes[0] = 3; 
                                                    classes[1] = 0; 
                                                } else {
                                                    if (features[1] <= 36.55000305175781) {
                                                        classes[0] = 0; 
                                                        classes[1] = 6; 
                                                    } else {
                                                        if (features[1] <= 37.650001525878906) {
                                                            classes[0] = 2; 
                                                            classes[1] = 0; 
                                                        } else {
                                                            classes[0] = 0; 
                                                            classes[1] = 6; 
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                } else {
                                    if (features[1] <= 35.099998474121094) {
                                        classes[0] = 0; 
                                        classes[1] = 8; 
                                    } else {
                                        classes[0] = 8; 
                                        classes[1] = 0; 
                                    }
                                }
                            }
                        } else {
                            if (features[2] <= 43.5) {
                                if (features[2] <= 33.5) {
                                    classes[0] = 0; 
                                    classes[1] = 3; 
                                } else {
                                    if (features[2] <= 35.0) {
                                        classes[0] = 2; 
                                        classes[1] = 0; 
                                    } else {
                                        if (features[2] <= 40.5) {
                                            classes[0] = 0; 
                                            classes[1] = 2; 
                                        } else {
                                            classes[0] = 2; 
                                            classes[1] = 0; 
                                        }
                                    }
                                }
                            } else {
                                classes[0] = 0; 
                                classes[1] = 11; 
                            }
                        }
                    } else {
                        if (features[1] <= 35.0) {
                            if (features[2] <= 41.5) {
                                if (features[1] <= 31.150001525878906) {
                                    if (features[0] <= 10.5) {
                                        classes[0] = 0; 
                                        classes[1] = 1; 
                                    } else {
                                        classes[0] = 1; 
                                        classes[1] = 0; 
                                    }
                                } else {
                                    classes[0] = 2; 
                                    classes[1] = 0; 
                                }
                            } else {
                                if (features[0] <= 12.0) {
                                    classes[0] = 0; 
                                    classes[1] = 5; 
                                } else {
                                    classes[0] = 1; 
                                    classes[1] = 0; 
                                }
                            }
                        } else {
                            if (features[0] <= 13.5) {
                                if (features[1] <= 37.29999923706055) {
                                    classes[0] = 9; 
                                    classes[1] = 0; 
                                } else {
                                    if (features[2] <= 42.5) {
                                        classes[0] = 0; 
                                        classes[1] = 2; 
                                    } else {
                                        classes[0] = 2; 
                                        classes[1] = 0; 
                                    }
                                }
                            } else {
                                classes[0] = 0; 
                                classes[1] = 3; 
                            }
                        }
                    }
                } else {
                    if (features[0] <= 7.5) {
                        if (features[0] <= 6.5) {
                            if (features[2] <= 36.5) {
                                classes[0] = 1; 
                                classes[1] = 0; 
                            } else {
                                classes[0] = 0; 
                                classes[1] = 1; 
                            }
                        } else {
                            if (features[1] <= 43.80000305175781) {
                                if (features[1] <= 40.55000305175781) {
                                    if (features[1] <= 39.650001525878906) {
                                        classes[0] = 0; 
                                        classes[1] = 1; 
                                    } else {
                                        classes[0] = 1; 
                                        classes[1] = 0; 
                                    }
                                } else {
                                    classes[0] = 0; 
                                    classes[1] = 4; 
                                }
                            } else {
                                if (features[1] <= 48.349998474121094) {
                                    classes[0] = 2; 
                                    classes[1] = 0; 
                                } else {
                                    classes[0] = 0; 
                                    classes[1] = 1; 
                                }
                            }
                        }
                    } else {
                        if (features[1] <= 45.900001525878906) {
                            if (features[0] <= 12.5) {
                                classes[0] = 0; 
                                classes[1] = 20; 
                            } else {
                                if (features[1] <= 40.25) {
                                    classes[0] = 0; 
                                    classes[1] = 2; 
                                } else {
                                    if (features[1] <= 41.44999694824219) {
                                        classes[0] = 1; 
                                        classes[1] = 0; 
                                    } else {
                                        classes[0] = 0; 
                                        classes[1] = 1; 
                                    }
                                }
                            }
                        } else {
                            if (features[1] <= 46.5) {
                                classes[0] = 1; 
                                classes[1] = 0; 
                            } else {
                                classes[0] = 0; 
                                classes[1] = 3; 
                            }
                        }
                    }
                }
            }
        }
        int class_idx = 0;
        int class_val = classes[0];
        for (int i = 1; i < 2; i++) {
            if (classes[i] > class_val) {
                class_idx = i;
                class_val = classes[i];
            }
        }
        return class_idx;
    }
    
    public static int predict_7(double[] features) {
        int[] classes = new int[2];
        
        if (features[2] <= 30.5) {
            if (features[2] <= 24.5) {
                if (features[1] <= 35.599998474121094) {
                    if (features[2] <= 21.5) {
                        classes[0] = 44; 
                        classes[1] = 0; 
                    } else {
                        if (features[2] <= 22.5) {
                            if (features[1] <= 31.0) {
                                if (features[0] <= 5.5) {
                                    if (features[0] <= 2.5) {
                                        classes[0] = 31; 
                                        classes[1] = 0; 
                                    } else {
                                        if (features[1] <= 25.200000762939453) {
                                            classes[0] = 3; 
                                            classes[1] = 0; 
                                        } else {
                                            if (features[1] <= 26.549999237060547) {
                                                classes[0] = 0; 
                                                classes[1] = 1; 
                                            } else {
                                                classes[0] = 2; 
                                                classes[1] = 0; 
                                            }
                                        }
                                    }
                                } else {
                                    classes[0] = 0; 
                                    classes[1] = 1; 
                                }
                            } else {
                                if (features[0] <= 0.5) {
                                    if (features[1] <= 32.20000076293945) {
                                        classes[0] = 0; 
                                        classes[1] = 3; 
                                    } else {
                                        if (features[1] <= 33.0) {
                                            classes[0] = 1; 
                                            classes[1] = 0; 
                                        } else {
                                            classes[0] = 0; 
                                            classes[1] = 3; 
                                        }
                                    }
                                } else {
                                    if (features[1] <= 31.600000381469727) {
                                        classes[0] = 0; 
                                        classes[1] = 2; 
                                    } else {
                                        classes[0] = 11; 
                                        classes[1] = 0; 
                                    }
                                }
                            }
                        } else {
                            if (features[2] <= 23.5) {
                                if (features[0] <= 1.5) {
                                    classes[0] = 18; 
                                    classes[1] = 0; 
                                } else {
                                    if (features[0] <= 2.5) {
                                        if (features[1] <= 30.25) {
                                            if (features[1] <= 27.549999237060547) {
                                                classes[0] = 4; 
                                                classes[1] = 0; 
                                            } else {
                                                classes[0] = 0; 
                                                classes[1] = 1; 
                                            }
                                        } else {
                                            classes[0] = 5; 
                                            classes[1] = 0; 
                                        }
                                    } else {
                                        classes[0] = 5; 
                                        classes[1] = 0; 
                                    }
                                }
                            } else {
                                if (features[1] <= 33.25) {
                                    classes[0] = 18; 
                                    classes[1] = 0; 
                                } else {
                                    if (features[0] <= 2.0) {
                                        classes[0] = 4; 
                                        classes[1] = 0; 
                                    } else {
                                        if (features[1] <= 33.75) {
                                            classes[0] = 0; 
                                            classes[1] = 1; 
                                        } else {
                                            classes[0] = 3; 
                                            classes[1] = 0; 
                                        }
                                    }
                                }
                            }
                        }
                    }
                } else {
                    if (features[0] <= 3.5) {
                        if (features[1] <= 38.04999923706055) {
                            if (features[0] <= 2.5) {
                                if (features[2] <= 21.5) {
                                    classes[0] = 2; 
                                    classes[1] = 0; 
                                } else {
                                    if (features[2] <= 23.5) {
                                        if (features[2] <= 22.5) {
                                            if (features[0] <= 0.5) {
                                                classes[0] = 0; 
                                                classes[1] = 1; 
                                            } else {
                                                classes[0] = 1; 
                                                classes[1] = 0; 
                                            }
                                        } else {
                                            classes[0] = 0; 
                                            classes[1] = 1; 
                                        }
                                    } else {
                                        if (features[0] <= 0.5) {
                                            classes[0] = 0; 
                                            classes[1] = 3; 
                                        } else {
                                            classes[0] = 3; 
                                            classes[1] = 0; 
                                        }
                                    }
                                }
                            } else {
                                classes[0] = 0; 
                                classes[1] = 3; 
                            }
                        } else {
                            if (features[0] <= 2.5) {
                                if (features[2] <= 22.5) {
                                    if (features[1] <= 39.29999923706055) {
                                        classes[0] = 4; 
                                        classes[1] = 0; 
                                    } else {
                                        if (features[0] <= 0.5) {
                                            if (features[2] <= 21.5) {
                                                if (features[1] <= 41.349998474121094) {
                                                    classes[0] = 2; 
                                                    classes[1] = 0; 
                                                } else {
                                                    classes[0] = 0; 
                                                    classes[1] = 2; 
                                                }
                                            } else {
                                                classes[0] = 1; 
                                                classes[1] = 0; 
                                            }
                                        } else {
                                            if (features[2] <= 21.5) {
                                                classes[0] = 1; 
                                                classes[1] = 0; 
                                            } else {
                                                if (features[1] <= 41.20000076293945) {
                                                    classes[0] = 0; 
                                                    classes[1] = 1; 
                                                } else {
                                                    classes[0] = 3; 
                                                    classes[1] = 0; 
                                                }
                                            }
                                        }
                                    }
                                } else {
                                    if (features[0] <= 0.5) {
                                        classes[0] = 5; 
                                        classes[1] = 0; 
                                    } else {
                                        if (features[2] <= 23.5) {
                                            if (features[1] <= 43.04999923706055) {
                                                classes[0] = 2; 
                                                classes[1] = 0; 
                                            } else {
                                                classes[0] = 0; 
                                                classes[1] = 3; 
                                            }
                                        } else {
                                            if (features[1] <= 40.25) {
                                                classes[0] = 3; 
                                                classes[1] = 0; 
                                            } else {
                                                classes[0] = 0; 
                                                classes[1] = 2; 
                                            }
                                        }
                                    }
                                }
                            } else {
                                classes[0] = 4; 
                                classes[1] = 0; 
                            }
                        }
                    } else {
                        classes[0] = 0; 
                        classes[1] = 2; 
                    }
                }
            } else {
                if (features[0] <= 6.5) {
                    if (features[2] <= 29.5) {
                        if (features[1] <= 40.94999694824219) {
                            if (features[0] <= 1.5) {
                                if (features[1] <= 30.100000381469727) {
                                    classes[0] = 15; 
                                    classes[1] = 0; 
                                } else {
                                    if (features[1] <= 30.850000381469727) {
                                        classes[0] = 0; 
                                        classes[1] = 1; 
                                    } else {
                                        if (features[2] <= 27.5) {
                                            if (features[2] <= 25.5) {
                                                if (features[1] <= 36.04999923706055) {
                                                    classes[0] = 3; 
                                                    classes[1] = 0; 
                                                } else {
                                                    if (features[1] <= 36.54999923706055) {
                                                        classes[0] = 0; 
                                                        classes[1] = 1; 
                                                    } else {
                                                        classes[0] = 1; 
                                                        classes[1] = 0; 
                                                    }
                                                }
                                            } else {
                                                classes[0] = 8; 
                                                classes[1] = 0; 
                                            }
                                        } else {
                                            if (features[1] <= 36.70000076293945) {
                                                if (features[2] <= 28.5) {
                                                    classes[0] = 0; 
                                                    classes[1] = 1; 
                                                } else {
                                                    if (features[1] <= 35.849998474121094) {
                                                        classes[0] = 4; 
                                                        classes[1] = 0; 
                                                    } else {
                                                        classes[0] = 0; 
                                                        classes[1] = 1; 
                                                    }
                                                }
                                            } else {
                                                classes[0] = 6; 
                                                classes[1] = 0; 
                                            }
                                        }
                                    }
                                }
                            } else {
                                if (features[0] <= 3.5) {
                                    if (features[1] <= 26.200000762939453) {
                                        classes[0] = 7; 
                                        classes[1] = 0; 
                                    } else {
                                        if (features[2] <= 26.5) {
                                            if (features[0] <= 2.5) {
                                                if (features[1] <= 38.599998474121094) {
                                                    classes[0] = 10; 
                                                    classes[1] = 0; 
                                                } else {
                                                    if (features[1] <= 39.599998474121094) {
                                                        classes[0] = 0; 
                                                        classes[1] = 2; 
                                                    } else {
                                                        classes[0] = 1; 
                                                        classes[1] = 0; 
                                                    }
                                                }
                                            } else {
                                                if (features[1] <= 34.45000076293945) {
                                                    if (features[1] <= 32.099998474121094) {
                                                        if (features[1] <= 30.899999618530273) {
                                                            classes[0] = 2; 
                                                            classes[1] = 0; 
                                                        } else {
                                                            classes[0] = 0; 
                                                            classes[1] = 1; 
                                                        }
                                                    } else {
                                                        classes[0] = 4; 
                                                        classes[1] = 0; 
                                                    }
                                                } else {
                                                    classes[0] = 0; 
                                                    classes[1] = 5; 
                                                }
                                            }
                                        } else {
                                            if (features[1] <= 27.75) {
                                                classes[0] = 0; 
                                                classes[1] = 6; 
                                            } else {
                                                if (features[2] <= 28.5) {
                                                    if (features[1] <= 29.0) {
                                                        classes[0] = 4; 
                                                        classes[1] = 0; 
                                                    } else {
                                                        if (features[1] <= 38.30000305175781) {
                                                            if (features[2] <= 27.5) {
                                                                if (features[1] <= 37.5) {
                                                                    if (features[1] <= 31.200000762939453) {
                                                                        classes[0] = 0; 
                                                                        classes[1] = 1; 
                                                                    } else {
                                                                        if (features[1] <= 35.5) {
                                                                            if (features[1] <= 33.30000305175781) {
                                                                                if (features[0] <= 2.5) {
                                                                                    classes[0] = 3; 
                                                                                    classes[1] = 0; 
                                                                                } else {
                                                                                    classes[0] = 0; 
                                                                                    classes[1] = 2; 
                                                                                }
                                                                            } else {
                                                                                classes[0] = 0; 
                                                                                classes[1] = 1; 
                                                                            }
                                                                        } else {
                                                                            classes[0] = 1; 
                                                                            classes[1] = 0; 
                                                                        }
                                                                    }
                                                                } else {
                                                                    classes[0] = 0; 
                                                                    classes[1] = 2; 
                                                                }
                                                            } else {
                                                                if (features[0] <= 2.5) {
                                                                    classes[0] = 1; 
                                                                    classes[1] = 0; 
                                                                } else {
                                                                    if (features[1] <= 34.400001525878906) {
                                                                        classes[0] = 1; 
                                                                        classes[1] = 3; 
                                                                    } else {
                                                                        classes[0] = 1; 
                                                                        classes[1] = 0; 
                                                                    }
                                                                }
                                                            }
                                                        } else {
                                                            classes[0] = 3; 
                                                            classes[1] = 0; 
                                                        }
                                                    }
                                                } else {
                                                    if (features[0] <= 2.5) {
                                                        if (features[1] <= 35.95000076293945) {
                                                            classes[0] = 0; 
                                                            classes[1] = 1; 
                                                        } else {
                                                            classes[0] = 2; 
                                                            classes[1] = 0; 
                                                        }
                                                    } else {
                                                        if (features[1] <= 29.450000762939453) {
                                                            classes[0] = 3; 
                                                            classes[1] = 0; 
                                                        } else {
                                                            classes[0] = 0; 
                                                            classes[1] = 1; 
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                } else {
                                    if (features[1] <= 36.150001525878906) {
                                        if (features[1] <= 29.899999618530273) {
                                            if (features[1] <= 26.299999237060547) {
                                                classes[0] = 7; 
                                                classes[1] = 0; 
                                            } else {
                                                if (features[0] <= 5.5) {
                                                    classes[0] = 5; 
                                                    classes[1] = 0; 
                                                } else {
                                                    classes[0] = 0; 
                                                    classes[1] = 1; 
                                                }
                                            }
                                        } else {
                                            if (features[2] <= 27.5) {
                                                if (features[0] <= 5.5) {
                                                    if (features[0] <= 4.5) {
                                                        if (features[2] <= 25.5) {
                                                            classes[0] = 1; 
                                                            classes[1] = 0; 
                                                        } else {
                                                            classes[0] = 0; 
                                                            classes[1] = 3; 
                                                        }
                                                    } else {
                                                        classes[0] = 0; 
                                                        classes[1] = 1; 
                                                    }
                                                } else {
                                                    classes[0] = 1; 
                                                    classes[1] = 0; 
                                                }
                                            } else {
                                                if (features[1] <= 32.0) {
                                                    classes[0] = 0; 
                                                    classes[1] = 1; 
                                                } else {
                                                    if (features[0] <= 5.0) {
                                                        classes[0] = 5; 
                                                        classes[1] = 0; 
                                                    } else {
                                                        classes[0] = 0; 
                                                        classes[1] = 1; 
                                                    }
                                                }
                                            }
                                        }
                                    } else {
                                        classes[0] = 8; 
                                        classes[1] = 0; 
                                    }
                                }
                            }
                        } else {
                            if (features[1] <= 49.5) {
                                if (features[2] <= 28.5) {
                                    if (features[1] <= 44.04999923706055) {
                                        classes[0] = 0; 
                                        classes[1] = 10; 
                                    } else {
                                        if (features[0] <= 4.5) {
                                            classes[0] = 2; 
                                            classes[1] = 0; 
                                        } else {
                                            if (features[1] <= 45.900001525878906) {
                                                classes[0] = 0; 
                                                classes[1] = 1; 
                                            } else {
                                                classes[0] = 1; 
                                                classes[1] = 0; 
                                            }
                                        }
                                    }
                                } else {
                                    if (features[0] <= 2.5) {
                                        if (features[1] <= 43.44999694824219) {
                                            classes[0] = 3; 
                                            classes[1] = 0; 
                                        } else {
                                            classes[0] = 0; 
                                            classes[1] = 1; 
                                        }
                                    } else {
                                        classes[0] = 1; 
                                        classes[1] = 0; 
                                    }
                                }
                            } else {
                                classes[0] = 0; 
                                classes[1] = 4; 
                            }
                        }
                    } else {
                        if (features[0] <= 2.5) {
                            if (features[0] <= 0.5) {
                                classes[0] = 0; 
                                classes[1] = 1; 
                            } else {
                                if (features[0] <= 1.5) {
                                    if (features[1] <= 31.44999885559082) {
                                        classes[0] = 1; 
                                        classes[1] = 0; 
                                    } else {
                                        if (features[1] <= 36.599998474121094) {
                                            classes[0] = 0; 
                                            classes[1] = 2; 
                                        } else {
                                            classes[0] = 1; 
                                            classes[1] = 0; 
                                        }
                                    }
                                } else {
                                    if (features[1] <= 36.150001525878906) {
                                        classes[0] = 0; 
                                        classes[1] = 1; 
                                    } else {
                                        classes[0] = 1; 
                                        classes[1] = 0; 
                                    }
                                }
                            }
                        } else {
                            classes[0] = 18; 
                            classes[1] = 0; 
                        }
                    }
                } else {
                    if (features[0] <= 9.5) {
                        classes[0] = 0; 
                        classes[1] = 4; 
                    } else {
                        classes[0] = 1; 
                        classes[1] = 0; 
                    }
                }
            }
        } else {
            if (features[0] <= 6.5) {
                if (features[2] <= 54.5) {
                    if (features[2] <= 49.5) {
                        if (features[1] <= 26.850000381469727) {
                            classes[0] = 19; 
                            classes[1] = 0; 
                        } else {
                            if (features[2] <= 45.5) {
                                if (features[1] <= 47.54999923706055) {
                                    if (features[2] <= 44.5) {
                                        if (features[0] <= 1.5) {
                                            if (features[1] <= 41.400001525878906) {
                                                if (features[1] <= 33.94999694824219) {
                                                    if (features[2] <= 43.0) {
                                                        classes[0] = 0; 
                                                        classes[1] = 5; 
                                                    } else {
                                                        classes[0] = 1; 
                                                        classes[1] = 0; 
                                                    }
                                                } else {
                                                    if (features[2] <= 40.5) {
                                                        classes[0] = 0; 
                                                        classes[1] = 15; 
                                                    } else {
                                                        if (features[1] <= 39.20000076293945) {
                                                            classes[0] = 1; 
                                                            classes[1] = 0; 
                                                        } else {
                                                            classes[0] = 0; 
                                                            classes[1] = 3; 
                                                        }
                                                    }
                                                }
                                            } else {
                                                classes[0] = 5; 
                                                classes[1] = 0; 
                                            }
                                        } else {
                                            if (features[2] <= 33.5) {
                                                if (features[2] <= 32.5) {
                                                    if (features[1] <= 30.200000762939453) {
                                                        if (features[0] <= 4.5) {
                                                            classes[0] = 5; 
                                                            classes[1] = 0; 
                                                        } else {
                                                            classes[0] = 1; 
                                                            classes[1] = 1; 
                                                        }
                                                    } else {
                                                        if (features[1] <= 32.900001525878906) {
                                                            classes[0] = 0; 
                                                            classes[1] = 4; 
                                                        } else {
                                                            if (features[2] <= 31.5) {
                                                                if (features[1] <= 38.54999923706055) {
                                                                    if (features[0] <= 2.5) {
                                                                        classes[0] = 2; 
                                                                        classes[1] = 0; 
                                                                    } else {
                                                                        classes[0] = 0; 
                                                                        classes[1] = 1; 
                                                                    }
                                                                } else {
                                                                    classes[0] = 0; 
                                                                    classes[1] = 1; 
                                                                }
                                                            } else {
                                                                classes[0] = 0; 
                                                                classes[1] = 2; 
                                                            }
                                                        }
                                                    }
                                                } else {
                                                    if (features[0] <= 4.5) {
                                                        classes[0] = 0; 
                                                        classes[1] = 3; 
                                                    } else {
                                                        if (features[1] <= 30.900001525878906) {
                                                            classes[0] = 0; 
                                                            classes[1] = 2; 
                                                        } else {
                                                            classes[0] = 2; 
                                                            classes[1] = 0; 
                                                        }
                                                    }
                                                }
                                            } else {
                                                if (features[2] <= 43.5) {
                                                    if (features[1] <= 38.150001525878906) {
                                                        if (features[2] <= 40.5) {
                                                            if (features[0] <= 2.5) {
                                                                classes[0] = 3; 
                                                                classes[1] = 0; 
                                                            } else {
                                                                if (features[2] <= 36.5) {
                                                                    if (features[1] <= 29.0) {
                                                                        classes[0] = 0; 
                                                                        classes[1] = 2; 
                                                                    } else {
                                                                        if (features[2] <= 34.5) {
                                                                            classes[0] = 6; 
                                                                            classes[1] = 0; 
                                                                        } else {
                                                                            if (features[2] <= 35.5) {
                                                                                if (features[0] <= 4.5) {
                                                                                    classes[0] = 0; 
                                                                                    classes[1] = 1; 
                                                                                } else {
                                                                                    if (features[1] <= 34.04999923706055) {
                                                                                        classes[0] = 0; 
                                                                                        classes[1] = 2; 
                                                                                    } else {
                                                                                        classes[0] = 1; 
                                                                                        classes[1] = 0; 
                                                                                    }
                                                                                }
                                                                            } else {
                                                                                if (features[1] <= 33.05000305175781) {
                                                                                    classes[0] = 1; 
                                                                                    classes[1] = 0; 
                                                                                } else {
                                                                                    classes[0] = 0; 
                                                                                    classes[1] = 1; 
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                } else {
                                                                    if (features[0] <= 4.5) {
                                                                        classes[0] = 9; 
                                                                        classes[1] = 0; 
                                                                    } else {
                                                                        if (features[1] <= 31.650001525878906) {
                                                                            classes[0] = 4; 
                                                                            classes[1] = 0; 
                                                                        } else {
                                                                            if (features[1] <= 34.04999923706055) {
                                                                                if (features[0] <= 5.5) {
                                                                                    classes[0] = 0; 
                                                                                    classes[1] = 1; 
                                                                                } else {
                                                                                    if (features[1] <= 33.80000305175781) {
                                                                                        classes[0] = 0; 
                                                                                        classes[1] = 1; 
                                                                                    } else {
                                                                                        classes[0] = 1; 
                                                                                        classes[1] = 0; 
                                                                                    }
                                                                                }
                                                                            } else {
                                                                                classes[0] = 3; 
                                                                                classes[1] = 0; 
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        } else {
                                                            if (features[1] <= 30.549999237060547) {
                                                                classes[0] = 0; 
                                                                classes[1] = 3; 
                                                            } else {
                                                                if (features[1] <= 32.05000305175781) {
                                                                    classes[0] = 1; 
                                                                    classes[1] = 0; 
                                                                } else {
                                                                    if (features[1] <= 33.45000076293945) {
                                                                        classes[0] = 0; 
                                                                        classes[1] = 1; 
                                                                    } else {
                                                                        if (features[1] <= 35.900001525878906) {
                                                                            classes[0] = 1; 
                                                                            classes[1] = 0; 
                                                                        } else {
                                                                            classes[0] = 0; 
                                                                            classes[1] = 1; 
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    } else {
                                                        classes[0] = 7; 
                                                        classes[1] = 0; 
                                                    }
                                                } else {
                                                    classes[0] = 0; 
                                                    classes[1] = 2; 
                                                }
                                            }
                                        }
                                    } else {
                                        classes[0] = 0; 
                                        classes[1] = 3; 
                                    }
                                } else {
                                    classes[0] = 0; 
                                    classes[1] = 5; 
                                }
                            } else {
                                if (features[1] <= 28.200000762939453) {
                                    classes[0] = 0; 
                                    classes[1] = 1; 
                                } else {
                                    if (features[0] <= 5.5) {
                                        classes[0] = 5; 
                                        classes[1] = 0; 
                                    } else {
                                        if (features[1] <= 39.900001525878906) {
                                            classes[0] = 2; 
                                            classes[1] = 0; 
                                        } else {
                                            classes[0] = 0; 
                                            classes[1] = 1; 
                                        }
                                    }
                                }
                            }
                        }
                    } else {
                        classes[0] = 0; 
                        classes[1] = 11; 
                    }
                } else {
                    if (features[1] <= 28.400001525878906) {
                        if (features[0] <= 5.5) {
                            classes[0] = 12; 
                            classes[1] = 0; 
                        } else {
                            if (features[1] <= 21.549999237060547) {
                                classes[0] = 2; 
                                classes[1] = 0; 
                            } else {
                                if (features[2] <= 57.0) {
                                    classes[0] = 1; 
                                    classes[1] = 0; 
                                } else {
                                    if (features[2] <= 62.5) {
                                        classes[0] = 0; 
                                        classes[1] = 1; 
                                    } else {
                                        classes[0] = 1; 
                                        classes[1] = 0; 
                                    }
                                }
                            }
                        }
                    } else {
                        if (features[0] <= 4.5) {
                            classes[0] = 0; 
                            classes[1] = 4; 
                        } else {
                            if (features[2] <= 65.5) {
                                classes[0] = 4; 
                                classes[1] = 0; 
                            } else {
                                classes[0] = 0; 
                                classes[1] = 2; 
                            }
                        }
                    }
                }
            } else {
                if (features[0] <= 7.5) {
                    if (features[1] <= 37.650001525878906) {
                        if (features[2] <= 36.5) {
                            classes[0] = 0; 
                            classes[1] = 5; 
                        } else {
                            if (features[1] <= 36.55000305175781) {
                                if (features[1] <= 30.149999618530273) {
                                    if (features[2] <= 53.0) {
                                        classes[0] = 5; 
                                        classes[1] = 0; 
                                    } else {
                                        classes[0] = 0; 
                                        classes[1] = 2; 
                                    }
                                } else {
                                    if (features[2] <= 38.0) {
                                        classes[0] = 1; 
                                        classes[1] = 0; 
                                    } else {
                                        if (features[2] <= 57.0) {
                                            if (features[1] <= 31.549999237060547) {
                                                classes[0] = 0; 
                                                classes[1] = 4; 
                                            } else {
                                                if (features[2] <= 41.5) {
                                                    classes[0] = 1; 
                                                    classes[1] = 0; 
                                                } else {
                                                    classes[0] = 0; 
                                                    classes[1] = 4; 
                                                }
                                            }
                                        } else {
                                            classes[0] = 1; 
                                            classes[1] = 0; 
                                        }
                                    }
                                }
                            } else {
                                classes[0] = 3; 
                                classes[1] = 0; 
                            }
                        }
                    } else {
                        if (features[1] <= 43.80000305175781) {
                            classes[0] = 0; 
                            classes[1] = 17; 
                        } else {
                            if (features[2] <= 39.0) {
                                classes[0] = 0; 
                                classes[1] = 1; 
                            } else {
                                classes[0] = 1; 
                                classes[1] = 0; 
                            }
                        }
                    }
                } else {
                    if (features[0] <= 12.5) {
                        if (features[0] <= 9.5) {
                            if (features[1] <= 27.849998474121094) {
                                if (features[1] <= 24.899999618530273) {
                                    if (features[1] <= 24.200000762939453) {
                                        if (features[2] <= 32.5) {
                                            classes[0] = 0; 
                                            classes[1] = 1; 
                                        } else {
                                            classes[0] = 6; 
                                            classes[1] = 0; 
                                        }
                                    } else {
                                        classes[0] = 0; 
                                        classes[1] = 2; 
                                    }
                                } else {
                                    classes[0] = 5; 
                                    classes[1] = 0; 
                                }
                            } else {
                                if (features[2] <= 63.0) {
                                    if (features[0] <= 8.5) {
                                        if (features[1] <= 35.099998474121094) {
                                            if (features[2] <= 41.5) {
                                                classes[0] = 0; 
                                                classes[1] = 7; 
                                            } else {
                                                if (features[2] <= 47.0) {
                                                    classes[0] = 1; 
                                                    classes[1] = 0; 
                                                } else {
                                                    classes[0] = 0; 
                                                    classes[1] = 4; 
                                                }
                                            }
                                        } else {
                                            if (features[2] <= 42.5) {
                                                if (features[2] <= 37.5) {
                                                    classes[0] = 0; 
                                                    classes[1] = 1; 
                                                } else {
                                                    classes[0] = 6; 
                                                    classes[1] = 0; 
                                                }
                                            } else {
                                                if (features[1] <= 38.95000076293945) {
                                                    if (features[2] <= 53.0) {
                                                        classes[0] = 2; 
                                                        classes[1] = 0; 
                                                    } else {
                                                        classes[0] = 0; 
                                                        classes[1] = 1; 
                                                    }
                                                } else {
                                                    classes[0] = 0; 
                                                    classes[1] = 2; 
                                                }
                                            }
                                        }
                                    } else {
                                        if (features[1] <= 33.04999923706055) {
                                            if (features[1] <= 30.799999237060547) {
                                                classes[0] = 0; 
                                                classes[1] = 3; 
                                            } else {
                                                if (features[2] <= 43.5) {
                                                    classes[0] = 3; 
                                                    classes[1] = 0; 
                                                } else {
                                                    classes[0] = 0; 
                                                    classes[1] = 3; 
                                                }
                                            }
                                        } else {
                                            if (features[1] <= 34.849998474121094) {
                                                classes[0] = 0; 
                                                classes[1] = 6; 
                                            } else {
                                                if (features[2] <= 37.0) {
                                                    classes[0] = 1; 
                                                    classes[1] = 0; 
                                                } else {
                                                    classes[0] = 0; 
                                                    classes[1] = 3; 
                                                }
                                            }
                                        }
                                    }
                                } else {
                                    classes[0] = 3; 
                                    classes[1] = 0; 
                                }
                            }
                        } else {
                            if (features[2] <= 37.5) {
                                if (features[0] <= 10.5) {
                                    if (features[2] <= 35.0) {
                                        if (features[2] <= 32.5) {
                                            classes[0] = 2; 
                                            classes[1] = 0; 
                                        } else {
                                            if (features[1] <= 31.0) {
                                                classes[0] = 2; 
                                                classes[1] = 0; 
                                            } else {
                                                classes[0] = 0; 
                                                classes[1] = 2; 
                                            }
                                        }
                                    } else {
                                        classes[0] = 5; 
                                        classes[1] = 0; 
                                    }
                                } else {
                                    classes[0] = 3; 
                                    classes[1] = 0; 
                                }
                            } else {
                                if (features[0] <= 11.5) {
                                    if (features[2] <= 52.5) {
                                        if (features[2] <= 47.5) {
                                            if (features[1] <= 38.55000305175781) {
                                                if (features[0] <= 10.5) {
                                                    if (features[1] <= 32.849998474121094) {
                                                        if (features[1] <= 27.549999237060547) {
                                                            classes[0] = 0; 
                                                            classes[1] = 1; 
                                                        } else {
                                                            if (features[1] <= 29.350000381469727) {
                                                                classes[0] = 1; 
                                                                classes[1] = 0; 
                                                            } else {
                                                                if (features[1] <= 31.150001525878906) {
                                                                    classes[0] = 0; 
                                                                    classes[1] = 1; 
                                                                } else {
                                                                    if (features[1] <= 31.80000114440918) {
                                                                        classes[0] = 1; 
                                                                        classes[1] = 0; 
                                                                    } else {
                                                                        classes[0] = 0; 
                                                                        classes[1] = 1; 
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    } else {
                                                        classes[0] = 6; 
                                                        classes[1] = 0; 
                                                    }
                                                } else {
                                                    classes[0] = 0; 
                                                    classes[1] = 1; 
                                                }
                                            } else {
                                                classes[0] = 0; 
                                                classes[1] = 5; 
                                            }
                                        } else {
                                            if (features[0] <= 10.5) {
                                                classes[0] = 0; 
                                                classes[1] = 4; 
                                            } else {
                                                if (features[2] <= 50.5) {
                                                    classes[0] = 0; 
                                                    classes[1] = 2; 
                                                } else {
                                                    if (features[1] <= 37.79999923706055) {
                                                        classes[0] = 0; 
                                                        classes[1] = 2; 
                                                    } else {
                                                        classes[0] = 1; 
                                                        classes[1] = 0; 
                                                    }
                                                }
                                            }
                                        }
                                    } else {
                                        classes[0] = 3; 
                                        classes[1] = 0; 
                                    }
                                } else {
                                    if (features[2] <= 39.5) {
                                        classes[0] = 0; 
                                        classes[1] = 2; 
                                    } else {
                                        if (features[2] <= 45.0) {
                                            classes[0] = 3; 
                                            classes[1] = 0; 
                                        } else {
                                            if (features[1] <= 37.25) {
                                                if (features[1] <= 28.100000381469727) {
                                                    classes[0] = 2; 
                                                    classes[1] = 0; 
                                                } else {
                                                    if (features[1] <= 29.850000381469727) {
                                                        classes[0] = 0; 
                                                        classes[1] = 1; 
                                                    } else {
                                                        classes[0] = 2; 
                                                        classes[1] = 0; 
                                                    }
                                                }
                                            } else {
                                                classes[0] = 0; 
                                                classes[1] = 1; 
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    } else {
                        if (features[1] <= 40.75) {
                            if (features[1] <= 33.900001525878906) {
                                if (features[0] <= 13.5) {
                                    if (features[1] <= 24.5) {
                                        classes[0] = 1; 
                                        classes[1] = 0; 
                                    } else {
                                        if (features[2] <= 42.0) {
                                            if (features[2] <= 39.5) {
                                                classes[0] = 0; 
                                                classes[1] = 2; 
                                            } else {
                                                classes[0] = 1; 
                                                classes[1] = 0; 
                                            }
                                        } else {
                                            classes[0] = 0; 
                                            classes[1] = 3; 
                                        }
                                    }
                                } else {
                                    classes[0] = 0; 
                                    classes[1] = 2; 
                                }
                            } else {
                                if (features[2] <= 47.5) {
                                    if (features[1] <= 38.849998474121094) {
                                        classes[0] = 0; 
                                        classes[1] = 1; 
                                    } else {
                                        classes[0] = 1; 
                                        classes[1] = 0; 
                                    }
                                } else {
                                    classes[0] = 2; 
                                    classes[1] = 0; 
                                }
                            }
                        } else {
                            classes[0] = 0; 
                            classes[1] = 10; 
                        }
                    }
                }
            }
        }
        int class_idx = 0;
        int class_val = classes[0];
        for (int i = 1; i < 2; i++) {
            if (classes[i] > class_val) {
                class_idx = i;
                class_val = classes[i];
            }
        }
        return class_idx;
    }
    
    public static int predict_8(double[] features) {
        int[] classes = new int[2];
        
        if (features[1] <= 27.349998474121094) {
            if (features[1] <= 23.25) {
                if (features[1] <= 9.100000381469727) {
                    if (features[2] <= 28.0) {
                        classes[0] = 12; 
                        classes[1] = 0; 
                    } else {
                        classes[0] = 0; 
                        classes[1] = 2; 
                    }
                } else {
                    classes[0] = 53; 
                    classes[1] = 0; 
                }
            } else {
                if (features[2] <= 42.5) {
                    if (features[0] <= 2.5) {
                        if (features[0] <= 1.5) {
                            classes[0] = 39; 
                            classes[1] = 0; 
                        } else {
                            if (features[2] <= 26.0) {
                                classes[0] = 15; 
                                classes[1] = 0; 
                            } else {
                                if (features[2] <= 28.0) {
                                    if (features[1] <= 26.700000762939453) {
                                        classes[0] = 0; 
                                        classes[1] = 1; 
                                    } else {
                                        classes[0] = 2; 
                                        classes[1] = 0; 
                                    }
                                } else {
                                    classes[0] = 1; 
                                    classes[1] = 0; 
                                }
                            }
                        }
                    } else {
                        if (features[1] <= 23.599998474121094) {
                            classes[0] = 0; 
                            classes[1] = 1; 
                        } else {
                            if (features[2] <= 28.5) {
                                if (features[2] <= 27.5) {
                                    if (features[2] <= 23.0) {
                                        if (features[1] <= 25.200000762939453) {
                                            classes[0] = 3; 
                                            classes[1] = 0; 
                                        } else {
                                            classes[0] = 0; 
                                            classes[1] = 1; 
                                        }
                                    } else {
                                        classes[0] = 9; 
                                        classes[1] = 0; 
                                    }
                                } else {
                                    classes[0] = 0; 
                                    classes[1] = 2; 
                                }
                            } else {
                                classes[0] = 21; 
                                classes[1] = 0; 
                            }
                        }
                    }
                } else {
                    if (features[2] <= 61.0) {
                        if (features[1] <= 24.5) {
                            if (features[0] <= 3.0) {
                                classes[0] = 2; 
                                classes[1] = 0; 
                            } else {
                                if (features[0] <= 5.0) {
                                    classes[0] = 0; 
                                    classes[1] = 2; 
                                } else {
                                    if (features[2] <= 58.5) {
                                        classes[0] = 3; 
                                        classes[1] = 0; 
                                    } else {
                                        classes[0] = 0; 
                                        classes[1] = 1; 
                                    }
                                }
                            }
                        } else {
                            if (features[1] <= 27.149999618530273) {
                                classes[0] = 0; 
                                classes[1] = 7; 
                            } else {
                                classes[0] = 1; 
                                classes[1] = 0; 
                            }
                        }
                    } else {
                        classes[0] = 9; 
                        classes[1] = 0; 
                    }
                }
            }
        } else {
            if (features[2] <= 30.5) {
                if (features[2] <= 22.5) {
                    if (features[2] <= 21.5) {
                        if (features[1] <= 33.900001525878906) {
                            classes[0] = 26; 
                            classes[1] = 0; 
                        } else {
                            if (features[1] <= 35.150001525878906) {
                                classes[0] = 0; 
                                classes[1] = 2; 
                            } else {
                                if (features[0] <= 0.5) {
                                    if (features[1] <= 41.349998474121094) {
                                        classes[0] = 4; 
                                        classes[1] = 0; 
                                    } else {
                                        if (features[1] <= 42.79999923706055) {
                                            classes[0] = 0; 
                                            classes[1] = 1; 
                                        } else {
                                            classes[0] = 1; 
                                            classes[1] = 0; 
                                        }
                                    }
                                } else {
                                    classes[0] = 4; 
                                    classes[1] = 0; 
                                }
                            }
                        }
                    } else {
                        if (features[0] <= 0.5) {
                            if (features[1] <= 33.0) {
                                classes[0] = 6; 
                                classes[1] = 0; 
                            } else {
                                if (features[1] <= 38.29999923706055) {
                                    classes[0] = 0; 
                                    classes[1] = 7; 
                                } else {
                                    classes[0] = 3; 
                                    classes[1] = 0; 
                                }
                            }
                        } else {
                            if (features[1] <= 35.20000076293945) {
                                if (features[0] <= 6.0) {
                                    classes[0] = 28; 
                                    classes[1] = 0; 
                                } else {
                                    classes[0] = 0; 
                                    classes[1] = 1; 
                                }
                            } else {
                                if (features[1] <= 50.099998474121094) {
                                    if (features[0] <= 2.0) {
                                        if (features[1] <= 38.599998474121094) {
                                            classes[0] = 1; 
                                            classes[1] = 0; 
                                        } else {
                                            classes[0] = 0; 
                                            classes[1] = 2; 
                                        }
                                    } else {
                                        classes[0] = 0; 
                                        classes[1] = 1; 
                                    }
                                } else {
                                    classes[0] = 2; 
                                    classes[1] = 0; 
                                }
                            }
                        }
                    }
                } else {
                    if (features[1] <= 27.650001525878906) {
                        classes[0] = 0; 
                        classes[1] = 6; 
                    } else {
                        if (features[2] <= 29.5) {
                            if (features[0] <= 0.5) {
                                if (features[2] <= 27.5) {
                                    if (features[1] <= 55.849998474121094) {
                                        if (features[1] <= 43.75) {
                                            if (features[1] <= 41.599998474121094) {
                                                if (features[2] <= 24.5) {
                                                    if (features[2] <= 23.5) {
                                                        if (features[1] <= 34.79999923706055) {
                                                            classes[0] = 0; 
                                                            classes[1] = 2; 
                                                        } else {
                                                            classes[0] = 4; 
                                                            classes[1] = 0; 
                                                        }
                                                    } else {
                                                        if (features[1] <= 31.55000114440918) {
                                                            classes[0] = 2; 
                                                            classes[1] = 0; 
                                                        } else {
                                                            if (features[1] <= 33.45000076293945) {
                                                                classes[0] = 0; 
                                                                classes[1] = 3; 
                                                            } else {
                                                                if (features[1] <= 35.95000076293945) {
                                                                    classes[0] = 1; 
                                                                    classes[1] = 0; 
                                                                } else {
                                                                    classes[0] = 0; 
                                                                    classes[1] = 2; 
                                                                }
                                                            }
                                                        }
                                                    }
                                                } else {
                                                    if (features[1] <= 31.450000762939453) {
                                                        if (features[2] <= 25.5) {
                                                            classes[0] = 0; 
                                                            classes[1] = 1; 
                                                        } else {
                                                            classes[0] = 1; 
                                                            classes[1] = 0; 
                                                        }
                                                    } else {
                                                        classes[0] = 10; 
                                                        classes[1] = 0; 
                                                    }
                                                }
                                            } else {
                                                if (features[2] <= 25.0) {
                                                    if (features[1] <= 42.69999694824219) {
                                                        classes[0] = 0; 
                                                        classes[1] = 3; 
                                                    } else {
                                                        classes[0] = 1; 
                                                        classes[1] = 0; 
                                                    }
                                                } else {
                                                    classes[0] = 0; 
                                                    classes[1] = 3; 
                                                }
                                            }
                                        } else {
                                            classes[0] = 7; 
                                            classes[1] = 0; 
                                        }
                                    } else {
                                        classes[0] = 0; 
                                        classes[1] = 3; 
                                    }
                                } else {
                                    if (features[1] <= 36.55000305175781) {
                                        classes[0] = 3; 
                                        classes[1] = 0; 
                                    } else {
                                        classes[0] = 0; 
                                        classes[1] = 5; 
                                    }
                                }
                            } else {
                                if (features[1] <= 44.0) {
                                    if (features[0] <= 1.5) {
                                        if (features[2] <= 28.5) {
                                            classes[0] = 27; 
                                            classes[1] = 0; 
                                        } else {
                                            if (features[1] <= 34.25) {
                                                classes[0] = 4; 
                                                classes[1] = 0; 
                                            } else {
                                                classes[0] = 0; 
                                                classes[1] = 1; 
                                            }
                                        }
                                    } else {
                                        if (features[0] <= 3.5) {
                                            if (features[1] <= 32.150001525878906) {
                                                if (features[2] <= 27.0) {
                                                    if (features[0] <= 2.5) {
                                                        if (features[2] <= 23.5) {
                                                            if (features[1] <= 30.25) {
                                                                classes[0] = 0; 
                                                                classes[1] = 3; 
                                                            } else {
                                                                classes[0] = 1; 
                                                                classes[1] = 0; 
                                                            }
                                                        } else {
                                                            if (features[1] <= 30.25) {
                                                                classes[0] = 8; 
                                                                classes[1] = 0; 
                                                            } else {
                                                                if (features[2] <= 24.5) {
                                                                    classes[0] = 1; 
                                                                    classes[1] = 0; 
                                                                } else {
                                                                    classes[0] = 0; 
                                                                    classes[1] = 1; 
                                                                }
                                                            }
                                                        }
                                                    } else {
                                                        if (features[1] <= 30.950000762939453) {
                                                            classes[0] = 7; 
                                                            classes[1] = 0; 
                                                        } else {
                                                            if (features[1] <= 31.100000381469727) {
                                                                classes[0] = 0; 
                                                                classes[1] = 1; 
                                                            } else {
                                                                classes[0] = 4; 
                                                                classes[1] = 0; 
                                                            }
                                                        }
                                                    }
                                                } else {
                                                    if (features[2] <= 28.5) {
                                                        classes[0] = 1; 
                                                        classes[1] = 1; 
                                                    } else {
                                                        if (features[0] <= 2.5) {
                                                            classes[0] = 0; 
                                                            classes[1] = 2; 
                                                        } else {
                                                            if (features[1] <= 29.450000762939453) {
                                                                classes[0] = 2; 
                                                                classes[1] = 0; 
                                                            } else {
                                                                classes[0] = 0; 
                                                                classes[1] = 2; 
                                                            }
                                                        }
                                                    }
                                                }
                                            } else {
                                                if (features[0] <= 2.5) {
                                                    if (features[1] <= 37.900001525878906) {
                                                        if (features[2] <= 27.5) {
                                                            classes[0] = 11; 
                                                            classes[1] = 0; 
                                                        } else {
                                                            classes[0] = 0; 
                                                            classes[1] = 2; 
                                                        }
                                                    } else {
                                                        if (features[1] <= 38.30000305175781) {
                                                            classes[0] = 0; 
                                                            classes[1] = 3; 
                                                        } else {
                                                            if (features[2] <= 25.5) {
                                                                if (features[1] <= 38.900001525878906) {
                                                                    classes[0] = 0; 
                                                                    classes[1] = 3; 
                                                                } else {
                                                                    classes[0] = 2; 
                                                                    classes[1] = 0; 
                                                                }
                                                            } else {
                                                                classes[0] = 4; 
                                                                classes[1] = 0; 
                                                            }
                                                        }
                                                    }
                                                } else {
                                                    if (features[1] <= 37.04999923706055) {
                                                        classes[0] = 0; 
                                                        classes[1] = 7; 
                                                    } else {
                                                        if (features[1] <= 38.25) {
                                                            classes[0] = 1; 
                                                            classes[1] = 0; 
                                                        } else {
                                                            classes[0] = 0; 
                                                            classes[1] = 3; 
                                                        }
                                                    }
                                                }
                                            }
                                        } else {
                                            if (features[0] <= 7.5) {
                                                if (features[1] <= 33.05000305175781) {
                                                    if (features[0] <= 4.5) {
                                                        if (features[1] <= 32.19999694824219) {
                                                            classes[0] = 7; 
                                                            classes[1] = 0; 
                                                        } else {
                                                            if (features[2] <= 25.0) {
                                                                if (features[1] <= 32.849998474121094) {
                                                                    classes[0] = 1; 
                                                                    classes[1] = 0; 
                                                                } else {
                                                                    classes[0] = 0; 
                                                                    classes[1] = 3; 
                                                                }
                                                            } else {
                                                                classes[0] = 0; 
                                                                classes[1] = 1; 
                                                            }
                                                        }
                                                    } else {
                                                        classes[0] = 0; 
                                                        classes[1] = 1; 
                                                    }
                                                } else {
                                                    if (features[0] <= 5.5) {
                                                        if (features[1] <= 34.650001525878906) {
                                                            classes[0] = 10; 
                                                            classes[1] = 0; 
                                                        } else {
                                                            if (features[0] <= 4.5) {
                                                                if (features[1] <= 34.900001525878906) {
                                                                    classes[0] = 0; 
                                                                    classes[1] = 1; 
                                                                } else {
                                                                    classes[0] = 6; 
                                                                    classes[1] = 0; 
                                                                }
                                                            } else {
                                                                if (features[2] <= 26.0) {
                                                                    classes[0] = 0; 
                                                                    classes[1] = 1; 
                                                                } else {
                                                                    if (features[1] <= 38.55000305175781) {
                                                                        classes[0] = 2; 
                                                                        classes[1] = 0; 
                                                                    } else {
                                                                        classes[0] = 0; 
                                                                        classes[1] = 1; 
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    } else {
                                                        classes[0] = 5; 
                                                        classes[1] = 0; 
                                                    }
                                                }
                                            } else {
                                                if (features[1] <= 32.150001525878906) {
                                                    classes[0] = 0; 
                                                    classes[1] = 2; 
                                                } else {
                                                    classes[0] = 2; 
                                                    classes[1] = 0; 
                                                }
                                            }
                                        }
                                    }
                                } else {
                                    if (features[2] <= 25.0) {
                                        classes[0] = 0; 
                                        classes[1] = 4; 
                                    } else {
                                        if (features[1] <= 50.54999923706055) {
                                            if (features[2] <= 26.5) {
                                                classes[0] = 1; 
                                                classes[1] = 0; 
                                            } else {
                                                if (features[1] <= 45.900001525878906) {
                                                    classes[0] = 0; 
                                                    classes[1] = 1; 
                                                } else {
                                                    classes[0] = 2; 
                                                    classes[1] = 0; 
                                                }
                                            }
                                        } else {
                                            classes[0] = 0; 
                                            classes[1] = 1; 
                                        }
                                    }
                                }
                            }
                        } else {
                            if (features[1] <= 34.70000076293945) {
                                if (features[1] <= 29.200000762939453) {
                                    classes[0] = 4; 
                                    classes[1] = 0; 
                                } else {
                                    if (features[1] <= 29.900001525878906) {
                                        classes[0] = 0; 
                                        classes[1] = 1; 
                                    } else {
                                        if (features[1] <= 32.29999923706055) {
                                            classes[0] = 1; 
                                            classes[1] = 0; 
                                        } else {
                                            classes[0] = 0; 
                                            classes[1] = 1; 
                                        }
                                    }
                                }
                            } else {
                                classes[0] = 10; 
                                classes[1] = 0; 
                            }
                        }
                    }
                }
            } else {
                if (features[0] <= 3.5) {
                    if (features[1] <= 32.849998474121094) {
                        if (features[2] <= 56.0) {
                            if (features[0] <= 1.5) {
                                if (features[2] <= 45.5) {
                                    if (features[1] <= 32.400001525878906) {
                                        if (features[2] <= 39.0) {
                                            classes[0] = 0; 
                                            classes[1] = 2; 
                                        } else {
                                            if (features[1] <= 30.649999618530273) {
                                                classes[0] = 0; 
                                                classes[1] = 1; 
                                            } else {
                                                classes[0] = 1; 
                                                classes[1] = 0; 
                                            }
                                        }
                                    } else {
                                        classes[0] = 0; 
                                        classes[1] = 3; 
                                    }
                                } else {
                                    classes[0] = 3; 
                                    classes[1] = 0; 
                                }
                            } else {
                                classes[0] = 4; 
                                classes[1] = 0; 
                            }
                        } else {
                            classes[0] = 0; 
                            classes[1] = 1; 
                        }
                    } else {
                        if (features[2] <= 45.0) {
                            if (features[0] <= 0.5) {
                                if (features[1] <= 46.29999923706055) {
                                    if (features[2] <= 34.0) {
                                        classes[0] = 0; 
                                        classes[1] = 6; 
                                    } else {
                                        if (features[1] <= 39.95000076293945) {
                                            classes[0] = 0; 
                                            classes[1] = 1; 
                                        } else {
                                            classes[0] = 1; 
                                            classes[1] = 0; 
                                        }
                                    }
                                } else {
                                    classes[0] = 1; 
                                    classes[1] = 0; 
                                }
                            } else {
                                if (features[1] <= 36.849998474121094) {
                                    classes[0] = 0; 
                                    classes[1] = 15; 
                                } else {
                                    if (features[0] <= 2.5) {
                                        if (features[0] <= 1.5) {
                                            if (features[1] <= 38.95000076293945) {
                                                classes[0] = 1; 
                                                classes[1] = 0; 
                                            } else {
                                                classes[0] = 0; 
                                                classes[1] = 5; 
                                            }
                                        } else {
                                            classes[0] = 0; 
                                            classes[1] = 3; 
                                        }
                                    } else {
                                        classes[0] = 1; 
                                        classes[1] = 0; 
                                    }
                                }
                            }
                        } else {
                            if (features[1] <= 46.29999923706055) {
                                if (features[2] <= 49.0) {
                                    if (features[1] <= 45.69999694824219) {
                                        classes[0] = 2; 
                                        classes[1] = 0; 
                                    } else {
                                        classes[0] = 0; 
                                        classes[1] = 2; 
                                    }
                                } else {
                                    classes[0] = 0; 
                                    classes[1] = 2; 
                                }
                            } else {
                                classes[0] = 3; 
                                classes[1] = 0; 
                            }
                        }
                    }
                } else {
                    if (features[1] <= 37.45000076293945) {
                        if (features[0] <= 10.5) {
                            if (features[2] <= 45.5) {
                                if (features[2] <= 36.5) {
                                    if (features[0] <= 6.5) {
                                        if (features[0] <= 4.5) {
                                            if (features[1] <= 30.799999237060547) {
                                                classes[0] = 3; 
                                                classes[1] = 0; 
                                            } else {
                                                if (features[2] <= 32.5) {
                                                    if (features[1] <= 34.80000305175781) {
                                                        classes[0] = 0; 
                                                        classes[1] = 4; 
                                                    } else {
                                                        if (features[1] <= 36.849998474121094) {
                                                            classes[0] = 3; 
                                                            classes[1] = 0; 
                                                        } else {
                                                            classes[0] = 0; 
                                                            classes[1] = 1; 
                                                        }
                                                    }
                                                } else {
                                                    classes[0] = 1; 
                                                    classes[1] = 0; 
                                                }
                                            }
                                        } else {
                                            if (features[0] <= 5.5) {
                                                if (features[2] <= 34.0) {
                                                    if (features[2] <= 32.5) {
                                                        classes[0] = 2; 
                                                        classes[1] = 2; 
                                                    } else {
                                                        classes[0] = 2; 
                                                        classes[1] = 0; 
                                                    }
                                                } else {
                                                    classes[0] = 0; 
                                                    classes[1] = 2; 
                                                }
                                            } else {
                                                if (features[2] <= 34.0) {
                                                    if (features[2] <= 31.5) {
                                                        if (features[1] <= 30.349998474121094) {
                                                            classes[0] = 2; 
                                                            classes[1] = 0; 
                                                        } else {
                                                            classes[0] = 0; 
                                                            classes[1] = 1; 
                                                        }
                                                    } else {
                                                        classes[0] = 1; 
                                                        classes[1] = 0; 
                                                    }
                                                } else {
                                                    classes[0] = 0; 
                                                    classes[1] = 1; 
                                                }
                                            }
                                        }
                                    } else {
                                        if (features[2] <= 33.5) {
                                            classes[0] = 0; 
                                            classes[1] = 4; 
                                        } else {
                                            if (features[2] <= 35.0) {
                                                if (features[1] <= 34.650001525878906) {
                                                    classes[0] = 0; 
                                                    classes[1] = 2; 
                                                } else {
                                                    classes[0] = 1; 
                                                    classes[1] = 0; 
                                                }
                                            } else {
                                                if (features[1] <= 29.849998474121094) {
                                                    classes[0] = 2; 
                                                    classes[1] = 0; 
                                                } else {
                                                    classes[0] = 0; 
                                                    classes[1] = 1; 
                                                }
                                            }
                                        }
                                    }
                                } else {
                                    if (features[0] <= 4.5) {
                                        if (features[1] <= 30.099998474121094) {
                                            if (features[2] <= 42.5) {
                                                classes[0] = 2; 
                                                classes[1] = 0; 
                                            } else {
                                                classes[0] = 0; 
                                                classes[1] = 1; 
                                            }
                                        } else {
                                            classes[0] = 3; 
                                            classes[1] = 0; 
                                        }
                                    } else {
                                        if (features[0] <= 8.5) {
                                            if (features[1] <= 30.850000381469727) {
                                                if (features[1] <= 28.75) {
                                                    classes[0] = 1; 
                                                    classes[1] = 0; 
                                                } else {
                                                    classes[0] = 0; 
                                                    classes[1] = 4; 
                                                }
                                            } else {
                                                if (features[1] <= 32.69999694824219) {
                                                    if (features[0] <= 5.5) {
                                                        classes[0] = 0; 
                                                        classes[1] = 1; 
                                                    } else {
                                                        classes[0] = 7; 
                                                        classes[1] = 0; 
                                                    }
                                                } else {
                                                    if (features[1] <= 33.25) {
                                                        classes[0] = 0; 
                                                        classes[1] = 4; 
                                                    } else {
                                                        if (features[2] <= 37.5) {
                                                            classes[0] = 0; 
                                                            classes[1] = 2; 
                                                        } else {
                                                            if (features[1] <= 35.400001525878906) {
                                                                if (features[1] <= 33.80000305175781) {
                                                                    if (features[2] <= 41.5) {
                                                                        classes[0] = 0; 
                                                                        classes[1] = 1; 
                                                                    } else {
                                                                        classes[0] = 1; 
                                                                        classes[1] = 0; 
                                                                    }
                                                                } else {
                                                                    classes[0] = 8; 
                                                                    classes[1] = 0; 
                                                                }
                                                            } else {
                                                                if (features[1] <= 36.55000305175781) {
                                                                    classes[0] = 0; 
                                                                    classes[1] = 4; 
                                                                } else {
                                                                    classes[0] = 2; 
                                                                    classes[1] = 0; 
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        } else {
                                            if (features[1] <= 32.75) {
                                                if (features[1] <= 31.150001525878906) {
                                                    if (features[0] <= 9.5) {
                                                        classes[0] = 1; 
                                                        classes[1] = 0; 
                                                    } else {
                                                        classes[0] = 0; 
                                                        classes[1] = 4; 
                                                    }
                                                } else {
                                                    if (features[0] <= 9.5) {
                                                        if (features[2] <= 43.5) {
                                                            classes[0] = 2; 
                                                            classes[1] = 0; 
                                                        } else {
                                                            classes[0] = 0; 
                                                            classes[1] = 2; 
                                                        }
                                                    } else {
                                                        classes[0] = 1; 
                                                        classes[1] = 0; 
                                                    }
                                                }
                                            } else {
                                                classes[0] = 8; 
                                                classes[1] = 0; 
                                            }
                                        }
                                    }
                                }
                            } else {
                                if (features[2] <= 62.0) {
                                    if (features[1] <= 35.150001525878906) {
                                        if (features[1] <= 28.849998474121094) {
                                            if (features[2] <= 48.5) {
                                                classes[0] = 2; 
                                                classes[1] = 0; 
                                            } else {
                                                classes[0] = 0; 
                                                classes[1] = 4; 
                                            }
                                        } else {
                                            if (features[2] <= 49.5) {
                                                if (features[0] <= 5.0) {
                                                    classes[0] = 0; 
                                                    classes[1] = 4; 
                                                } else {
                                                    if (features[0] <= 6.5) {
                                                        classes[0] = 2; 
                                                        classes[1] = 0; 
                                                    } else {
                                                        classes[0] = 0; 
                                                        classes[1] = 2; 
                                                    }
                                                }
                                            } else {
                                                classes[0] = 0; 
                                                classes[1] = 10; 
                                            }
                                        }
                                    } else {
                                        if (features[1] <= 36.94999694824219) {
                                            if (features[2] <= 51.0) {
                                                classes[0] = 4; 
                                                classes[1] = 0; 
                                            } else {
                                                if (features[2] <= 54.5) {
                                                    classes[0] = 0; 
                                                    classes[1] = 1; 
                                                } else {
                                                    classes[0] = 3; 
                                                    classes[1] = 0; 
                                                }
                                            }
                                        } else {
                                            classes[0] = 0; 
                                            classes[1] = 1; 
                                        }
                                    }
                                } else {
                                    if (features[2] <= 69.0) {
                                        if (features[2] <= 65.5) {
                                            classes[0] = 4; 
                                            classes[1] = 0; 
                                        } else {
                                            if (features[0] <= 7.0) {
                                                if (features[1] <= 31.649999618530273) {
                                                    classes[0] = 2; 
                                                    classes[1] = 0; 
                                                } else {
                                                    classes[0] = 0; 
                                                    classes[1] = 1; 
                                                }
                                            } else {
                                                classes[0] = 1; 
                                                classes[1] = 0; 
                                            }
                                        }
                                    } else {
                                        classes[0] = 0; 
                                        classes[1] = 2; 
                                    }
                                }
                            }
                        } else {
                            if (features[1] <= 29.850000381469727) {
                                classes[0] = 0; 
                                classes[1] = 5; 
                            } else {
                                if (features[2] <= 48.0) {
                                    if (features[0] <= 13.5) {
                                        if (features[2] <= 39.5) {
                                            if (features[1] <= 30.650001525878906) {
                                                classes[0] = 1; 
                                                classes[1] = 0; 
                                            } else {
                                                classes[0] = 0; 
                                                classes[1] = 1; 
                                            }
                                        } else {
                                            classes[0] = 4; 
                                            classes[1] = 0; 
                                        }
                                    } else {
                                        classes[0] = 0; 
                                        classes[1] = 2; 
                                    }
                                } else {
                                    if (features[0] <= 12.0) {
                                        classes[0] = 0; 
                                        classes[1] = 5; 
                                    } else {
                                        classes[0] = 1; 
                                        classes[1] = 0; 
                                    }
                                }
                            }
                        }
                    } else {
                        if (features[0] <= 6.5) {
                            if (features[0] <= 5.5) {
                                if (features[1] <= 38.599998474121094) {
                                    classes[0] = 0; 
                                    classes[1] = 4; 
                                } else {
                                    if (features[0] <= 4.5) {
                                        if (features[2] <= 35.0) {
                                            classes[0] = 0; 
                                            classes[1] = 1; 
                                        } else {
                                            classes[0] = 1; 
                                            classes[1] = 0; 
                                        }
                                    } else {
                                        if (features[1] <= 40.25) {
                                            classes[0] = 4; 
                                            classes[1] = 0; 
                                        } else {
                                            classes[0] = 0; 
                                            classes[1] = 3; 
                                        }
                                    }
                                }
                            } else {
                                classes[0] = 1; 
                                classes[1] = 0; 
                            }
                        } else {
                            if (features[0] <= 10.5) {
                                if (features[2] <= 42.5) {
                                    if (features[0] <= 7.5) {
                                        classes[0] = 0; 
                                        classes[1] = 6; 
                                    } else {
                                        if (features[1] <= 39.95000076293945) {
                                            if (features[2] <= 38.0) {
                                                classes[0] = 0; 
                                                classes[1] = 1; 
                                            } else {
                                                classes[0] = 2; 
                                                classes[1] = 0; 
                                            }
                                        } else {
                                            classes[0] = 0; 
                                            classes[1] = 2; 
                                        }
                                    }
                                } else {
                                    classes[0] = 0; 
                                    classes[1] = 14; 
                                }
                            } else {
                                if (features[1] <= 44.25) {
                                    classes[0] = 0; 
                                    classes[1] = 5; 
                                } else {
                                    if (features[1] <= 49.25) {
                                        classes[0] = 4; 
                                        classes[1] = 0; 
                                    } else {
                                        classes[0] = 0; 
                                        classes[1] = 2; 
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        int class_idx = 0;
        int class_val = classes[0];
        for (int i = 1; i < 2; i++) {
            if (classes[i] > class_val) {
                class_idx = i;
                class_val = classes[i];
            }
        }
        return class_idx;
    }
    
    public static int predict_9(double[] features) {
        int[] classes = new int[2];
        
        if (features[2] <= 30.5) {
            if (features[0] <= 2.5) {
                if (features[1] <= 31.799999237060547) {
                    if (features[0] <= 0.5) {
                        if (features[2] <= 24.0) {
                            classes[0] = 22; 
                            classes[1] = 0; 
                        } else {
                            if (features[2] <= 26.0) {
                                if (features[1] <= 25.799999237060547) {
                                    classes[0] = 3; 
                                    classes[1] = 0; 
                                } else {
                                    classes[0] = 0; 
                                    classes[1] = 1; 
                                }
                            } else {
                                classes[0] = 6; 
                                classes[1] = 0; 
                            }
                        }
                    } else {
                        if (features[1] <= 26.549999237060547) {
                            classes[0] = 60; 
                            classes[1] = 0; 
                        } else {
                            if (features[1] <= 26.700000762939453) {
                                classes[0] = 0; 
                                classes[1] = 1; 
                            } else {
                                classes[0] = 58; 
                                classes[1] = 0; 
                            }
                        }
                    }
                } else {
                    if (features[1] <= 42.04999923706055) {
                        if (features[2] <= 26.5) {
                            if (features[1] <= 34.69999694824219) {
                                if (features[2] <= 21.5) {
                                    if (features[1] <= 33.0) {
                                        classes[0] = 1; 
                                        classes[1] = 0; 
                                    } else {
                                        classes[0] = 0; 
                                        classes[1] = 4; 
                                    }
                                } else {
                                    if (features[2] <= 24.5) {
                                        if (features[0] <= 0.5) {
                                            if (features[2] <= 23.0) {
                                                if (features[1] <= 33.75) {
                                                    if (features[1] <= 32.20000076293945) {
                                                        classes[0] = 0; 
                                                        classes[1] = 1; 
                                                    } else {
                                                        classes[0] = 3; 
                                                        classes[1] = 0; 
                                                    }
                                                } else {
                                                    classes[0] = 0; 
                                                    classes[1] = 2; 
                                                }
                                            } else {
                                                if (features[1] <= 33.45000076293945) {
                                                    classes[0] = 0; 
                                                    classes[1] = 2; 
                                                } else {
                                                    classes[0] = 1; 
                                                    classes[1] = 0; 
                                                }
                                            }
                                        } else {
                                            classes[0] = 8; 
                                            classes[1] = 0; 
                                        }
                                    } else {
                                        classes[0] = 2; 
                                        classes[1] = 0; 
                                    }
                                }
                            } else {
                                if (features[0] <= 0.5) {
                                    if (features[1] <= 38.0) {
                                        if (features[2] <= 25.5) {
                                            if (features[2] <= 21.5) {
                                                classes[0] = 2; 
                                                classes[1] = 0; 
                                            } else {
                                                if (features[2] <= 24.5) {
                                                    classes[0] = 0; 
                                                    classes[1] = 2; 
                                                } else {
                                                    if (features[1] <= 36.19999694824219) {
                                                        classes[0] = 1; 
                                                        classes[1] = 0; 
                                                    } else {
                                                        if (features[1] <= 36.69999694824219) {
                                                            classes[0] = 0; 
                                                            classes[1] = 1; 
                                                        } else {
                                                            classes[0] = 1; 
                                                            classes[1] = 0; 
                                                        }
                                                    }
                                                }
                                            }
                                        } else {
                                            classes[0] = 3; 
                                            classes[1] = 0; 
                                        }
                                    } else {
                                        classes[0] = 5; 
                                        classes[1] = 0; 
                                    }
                                } else {
                                    if (features[1] <= 39.70000076293945) {
                                        classes[0] = 23; 
                                        classes[1] = 0; 
                                    } else {
                                        if (features[2] <= 22.5) {
                                            classes[0] = 0; 
                                            classes[1] = 1; 
                                        } else {
                                            classes[0] = 3; 
                                            classes[1] = 0; 
                                        }
                                    }
                                }
                            }
                        } else {
                            if (features[2] <= 28.5) {
                                if (features[2] <= 27.5) {
                                    if (features[1] <= 36.0) {
                                        classes[0] = 3; 
                                        classes[1] = 0; 
                                    } else {
                                        if (features[1] <= 39.849998474121094) {
                                            classes[0] = 0; 
                                            classes[1] = 3; 
                                        } else {
                                            classes[0] = 2; 
                                            classes[1] = 0; 
                                        }
                                    }
                                } else {
                                    if (features[0] <= 0.5) {
                                        classes[0] = 0; 
                                        classes[1] = 4; 
                                    } else {
                                        if (features[0] <= 1.5) {
                                            classes[0] = 6; 
                                            classes[1] = 0; 
                                        } else {
                                            classes[0] = 0; 
                                            classes[1] = 1; 
                                        }
                                    }
                                }
                            } else {
                                if (features[0] <= 0.5) {
                                    if (features[1] <= 33.75) {
                                        classes[0] = 0; 
                                        classes[1] = 1; 
                                    } else {
                                        classes[0] = 1; 
                                        classes[1] = 0; 
                                    }
                                } else {
                                    classes[0] = 6; 
                                    classes[1] = 0; 
                                }
                            }
                        }
                    } else {
                        if (features[1] <= 42.69999694824219) {
                            classes[0] = 0; 
                            classes[1] = 4; 
                        } else {
                            if (features[0] <= 0.5) {
                                if (features[1] <= 52.75) {
                                    if (features[1] <= 43.400001525878906) {
                                        if (features[1] <= 43.04999923706055) {
                                            classes[0] = 1; 
                                            classes[1] = 0; 
                                        } else {
                                            classes[0] = 0; 
                                            classes[1] = 1; 
                                        }
                                    } else {
                                        if (features[1] <= 48.75) {
                                            if (features[2] <= 22.5) {
                                                classes[0] = 5; 
                                                classes[1] = 0; 
                                            } else {
                                                if (features[2] <= 23.5) {
                                                    classes[0] = 0; 
                                                    classes[1] = 1; 
                                                } else {
                                                    classes[0] = 5; 
                                                    classes[1] = 0; 
                                                }
                                            }
                                        } else {
                                            if (features[2] <= 24.5) {
                                                classes[0] = 2; 
                                                classes[1] = 0; 
                                            } else {
                                                classes[0] = 0; 
                                                classes[1] = 1; 
                                            }
                                        }
                                    }
                                } else {
                                    classes[0] = 0; 
                                    classes[1] = 1; 
                                }
                            } else {
                                if (features[1] <= 45.400001525878906) {
                                    if (features[1] <= 44.900001525878906) {
                                        classes[0] = 0; 
                                        classes[1] = 2; 
                                    } else {
                                        classes[0] = 1; 
                                        classes[1] = 0; 
                                    }
                                } else {
                                    classes[0] = 0; 
                                    classes[1] = 5; 
                                }
                            }
                        }
                    }
                }
            } else {
                if (features[0] <= 3.5) {
                    if (features[2] <= 21.5) {
                        classes[0] = 4; 
                        classes[1] = 0; 
                    } else {
                        if (features[1] <= 30.299999237060547) {
                            if (features[2] <= 23.5) {
                                if (features[2] <= 22.5) {
                                    classes[0] = 2; 
                                    classes[1] = 0; 
                                } else {
                                    classes[0] = 0; 
                                    classes[1] = 2; 
                                }
                            } else {
                                if (features[1] <= 26.349998474121094) {
                                    classes[0] = 10; 
                                    classes[1] = 0; 
                                } else {
                                    if (features[1] <= 27.399999618530273) {
                                        classes[0] = 0; 
                                        classes[1] = 2; 
                                    } else {
                                        classes[0] = 8; 
                                        classes[1] = 0; 
                                    }
                                }
                            }
                        } else {
                            if (features[1] <= 38.25) {
                                if (features[1] <= 32.150001525878906) {
                                    if (features[1] <= 31.75) {
                                        if (features[2] <= 24.5) {
                                            classes[0] = 2; 
                                            classes[1] = 0; 
                                        } else {
                                            if (features[1] <= 31.049999237060547) {
                                                classes[0] = 0; 
                                                classes[1] = 1; 
                                            } else {
                                                if (features[2] <= 26.5) {
                                                    classes[0] = 0; 
                                                    classes[1] = 2; 
                                                } else {
                                                    classes[0] = 2; 
                                                    classes[1] = 3; 
                                                }
                                            }
                                        }
                                    } else {
                                        classes[0] = 1; 
                                        classes[1] = 0; 
                                    }
                                } else {
                                    if (features[2] <= 24.5) {
                                        classes[0] = 0; 
                                        classes[1] = 5; 
                                    } else {
                                        if (features[2] <= 26.0) {
                                            if (features[1] <= 34.599998474121094) {
                                                classes[0] = 1; 
                                                classes[1] = 0; 
                                            } else {
                                                classes[0] = 0; 
                                                classes[1] = 2; 
                                            }
                                        } else {
                                            classes[0] = 0; 
                                            classes[1] = 4; 
                                        }
                                    }
                                }
                            } else {
                                classes[0] = 3; 
                                classes[1] = 0; 
                            }
                        }
                    }
                } else {
                    if (features[1] <= 42.900001525878906) {
                        if (features[0] <= 8.0) {
                            if (features[0] <= 5.5) {
                                if (features[2] <= 22.5) {
                                    if (features[1] <= 27.950000762939453) {
                                        classes[0] = 2; 
                                        classes[1] = 0; 
                                    } else {
                                        classes[0] = 0; 
                                        classes[1] = 2; 
                                    }
                                } else {
                                    if (features[2] <= 28.5) {
                                        if (features[0] <= 4.5) {
                                            if (features[2] <= 27.5) {
                                                if (features[1] <= 30.599998474121094) {
                                                    classes[0] = 7; 
                                                    classes[1] = 0; 
                                                } else {
                                                    if (features[2] <= 25.5) {
                                                        if (features[1] <= 33.05000305175781) {
                                                            classes[0] = 0; 
                                                            classes[1] = 1; 
                                                        } else {
                                                            classes[0] = 6; 
                                                            classes[1] = 0; 
                                                        }
                                                    } else {
                                                        classes[0] = 0; 
                                                        classes[1] = 1; 
                                                    }
                                                }
                                            } else {
                                                classes[0] = 3; 
                                                classes[1] = 0; 
                                            }
                                        } else {
                                            classes[0] = 12; 
                                            classes[1] = 0; 
                                        }
                                    } else {
                                        if (features[2] <= 29.5) {
                                            if (features[1] <= 38.55000305175781) {
                                                classes[0] = 4; 
                                                classes[1] = 0; 
                                            } else {
                                                if (features[1] <= 40.80000305175781) {
                                                    classes[0] = 0; 
                                                    classes[1] = 2; 
                                                } else {
                                                    classes[0] = 2; 
                                                    classes[1] = 0; 
                                                }
                                            }
                                        } else {
                                            if (features[0] <= 4.5) {
                                                if (features[1] <= 30.450000762939453) {
                                                    classes[0] = 0; 
                                                    classes[1] = 1; 
                                                } else {
                                                    classes[0] = 4; 
                                                    classes[1] = 0; 
                                                }
                                            } else {
                                                classes[0] = 5; 
                                                classes[1] = 0; 
                                            }
                                        }
                                    }
                                }
                            } else {
                                if (features[0] <= 6.5) {
                                    if (features[1] <= 26.299999237060547) {
                                        classes[0] = 4; 
                                        classes[1] = 0; 
                                    } else {
                                        if (features[2] <= 28.5) {
                                            classes[0] = 8; 
                                            classes[1] = 0; 
                                        } else {
                                            if (features[2] <= 29.5) {
                                                classes[0] = 0; 
                                                classes[1] = 4; 
                                            } else {
                                                classes[0] = 1; 
                                                classes[1] = 0; 
                                            }
                                        }
                                    }
                                } else {
                                    classes[0] = 2; 
                                    classes[1] = 0; 
                                }
                            }
                        } else {
                            if (features[1] <= 32.150001525878906) {
                                classes[0] = 0; 
                                classes[1] = 3; 
                            } else {
                                classes[0] = 1; 
                                classes[1] = 0; 
                            }
                        }
                    } else {
                        classes[0] = 0; 
                        classes[1] = 3; 
                    }
                }
            }
        } else {
            if (features[0] <= 6.5) {
                if (features[0] <= 0.5) {
                    if (features[1] <= 30.600000381469727) {
                        classes[0] = 14; 
                        classes[1] = 0; 
                    } else {
                        if (features[2] <= 41.0) {
                            if (features[2] <= 31.5) {
                                if (features[1] <= 46.29999923706055) {
                                    classes[0] = 0; 
                                    classes[1] = 1; 
                                } else {
                                    classes[0] = 2; 
                                    classes[1] = 0; 
                                }
                            } else {
                                classes[0] = 0; 
                                classes[1] = 9; 
                            }
                        } else {
                            if (features[1] <= 35.04999923706055) {
                                classes[0] = 3; 
                                classes[1] = 0; 
                            } else {
                                if (features[1] <= 38.400001525878906) {
                                    classes[0] = 0; 
                                    classes[1] = 1; 
                                } else {
                                    classes[0] = 3; 
                                    classes[1] = 0; 
                                }
                            }
                        }
                    }
                } else {
                    if (features[1] <= 31.049999237060547) {
                        if (features[1] <= 23.399999618530273) {
                            classes[0] = 9; 
                            classes[1] = 0; 
                        } else {
                            if (features[2] <= 44.5) {
                                if (features[0] <= 2.5) {
                                    classes[0] = 8; 
                                    classes[1] = 0; 
                                } else {
                                    if (features[0] <= 5.5) {
                                        if (features[2] <= 36.5) {
                                            if (features[2] <= 35.0) {
                                                if (features[1] <= 29.25) {
                                                    if (features[2] <= 33.5) {
                                                        if (features[1] <= 28.5) {
                                                            classes[0] = 3; 
                                                            classes[1] = 0; 
                                                        } else {
                                                            classes[0] = 1; 
                                                            classes[1] = 1; 
                                                        }
                                                    } else {
                                                        classes[0] = 0; 
                                                        classes[1] = 1; 
                                                    }
                                                } else {
                                                    classes[0] = 6; 
                                                    classes[1] = 0; 
                                                }
                                            } else {
                                                if (features[1] <= 29.049999237060547) {
                                                    classes[0] = 0; 
                                                    classes[1] = 2; 
                                                } else {
                                                    classes[0] = 1; 
                                                    classes[1] = 0; 
                                                }
                                            }
                                        } else {
                                            classes[0] = 7; 
                                            classes[1] = 0; 
                                        }
                                    } else {
                                        if (features[2] <= 32.5) {
                                            classes[0] = 3; 
                                            classes[1] = 0; 
                                        } else {
                                            classes[0] = 0; 
                                            classes[1] = 2; 
                                        }
                                    }
                                }
                            } else {
                                if (features[0] <= 5.5) {
                                    if (features[2] <= 55.0) {
                                        classes[0] = 0; 
                                        classes[1] = 4; 
                                    } else {
                                        if (features[2] <= 61.0) {
                                            if (features[0] <= 4.5) {
                                                classes[0] = 0; 
                                                classes[1] = 1; 
                                            } else {
                                                classes[0] = 2; 
                                                classes[1] = 0; 
                                            }
                                        } else {
                                            classes[0] = 7; 
                                            classes[1] = 0; 
                                        }
                                    }
                                } else {
                                    if (features[2] <= 62.5) {
                                        if (features[2] <= 52.5) {
                                            classes[0] = 0; 
                                            classes[1] = 4; 
                                        } else {
                                            if (features[1] <= 23.850000381469727) {
                                                classes[0] = 0; 
                                                classes[1] = 2; 
                                            } else {
                                                classes[0] = 1; 
                                                classes[1] = 0; 
                                            }
                                        }
                                    } else {
                                        classes[0] = 3; 
                                        classes[1] = 0; 
                                    }
                                }
                            }
                        }
                    } else {
                        if (features[0] <= 1.5) {
                            if (features[1] <= 41.400001525878906) {
                                if (features[2] <= 44.0) {
                                    classes[0] = 0; 
                                    classes[1] = 11; 
                                } else {
                                    if (features[1] <= 33.900001525878906) {
                                        classes[0] = 1; 
                                        classes[1] = 1; 
                                    } else {
                                        classes[0] = 0; 
                                        classes[1] = 1; 
                                    }
                                }
                            } else {
                                if (features[2] <= 37.0) {
                                    if (features[1] <= 48.0) {
                                        classes[0] = 2; 
                                        classes[1] = 0; 
                                    } else {
                                        classes[0] = 0; 
                                        classes[1] = 1; 
                                    }
                                } else {
                                    classes[0] = 0; 
                                    classes[1] = 2; 
                                }
                            }
                        } else {
                            if (features[1] <= 43.0) {
                                if (features[2] <= 48.0) {
                                    if (features[2] <= 38.5) {
                                        if (features[2] <= 34.5) {
                                            if (features[2] <= 32.5) {
                                                if (features[1] <= 32.900001525878906) {
                                                    classes[0] = 0; 
                                                    classes[1] = 1; 
                                                } else {
                                                    if (features[0] <= 2.5) {
                                                        classes[0] = 1; 
                                                        classes[1] = 0; 
                                                    } else {
                                                        if (features[1] <= 36.55000305175781) {
                                                            classes[0] = 0; 
                                                            classes[1] = 1; 
                                                        } else {
                                                            if (features[0] <= 5.0) {
                                                                if (features[1] <= 36.849998474121094) {
                                                                    classes[0] = 2; 
                                                                    classes[1] = 0; 
                                                                } else {
                                                                    classes[0] = 0; 
                                                                    classes[1] = 1; 
                                                                }
                                                            } else {
                                                                classes[0] = 1; 
                                                                classes[1] = 0; 
                                                            }
                                                        }
                                                    }
                                                }
                                            } else {
                                                classes[0] = 3; 
                                                classes[1] = 0; 
                                            }
                                        } else {
                                            if (features[1] <= 39.25) {
                                                if (features[1] <= 35.650001525878906) {
                                                    classes[0] = 0; 
                                                    classes[1] = 8; 
                                                } else {
                                                    if (features[2] <= 35.5) {
                                                        classes[0] = 1; 
                                                        classes[1] = 0; 
                                                    } else {
                                                        classes[0] = 0; 
                                                        classes[1] = 5; 
                                                    }
                                                }
                                            } else {
                                                classes[0] = 3; 
                                                classes[1] = 0; 
                                            }
                                        }
                                    } else {
                                        if (features[2] <= 41.5) {
                                            if (features[1] <= 38.150001525878906) {
                                                if (features[1] <= 37.54999923706055) {
                                                    if (features[0] <= 4.5) {
                                                        classes[0] = 3; 
                                                        classes[1] = 0; 
                                                    } else {
                                                        classes[0] = 0; 
                                                        classes[1] = 1; 
                                                    }
                                                } else {
                                                    classes[0] = 0; 
                                                    classes[1] = 1; 
                                                }
                                            } else {
                                                classes[0] = 2; 
                                                classes[1] = 0; 
                                            }
                                        } else {
                                            classes[0] = 11; 
                                            classes[1] = 0; 
                                        }
                                    }
                                } else {
                                    if (features[1] <= 35.79999923706055) {
                                        if (features[2] <= 63.5) {
                                            classes[0] = 0; 
                                            classes[1] = 9; 
                                        } else {
                                            if (features[0] <= 4.5) {
                                                classes[0] = 0; 
                                                classes[1] = 1; 
                                            } else {
                                                classes[0] = 1; 
                                                classes[1] = 0; 
                                            }
                                        }
                                    } else {
                                        if (features[1] <= 36.54999923706055) {
                                            classes[0] = 2; 
                                            classes[1] = 0; 
                                        } else {
                                            if (features[1] <= 39.900001525878906) {
                                                classes[0] = 0; 
                                                classes[1] = 2; 
                                            } else {
                                                classes[0] = 2; 
                                                classes[1] = 0; 
                                            }
                                        }
                                    }
                                }
                            } else {
                                if (features[2] <= 39.0) {
                                    classes[0] = 0; 
                                    classes[1] = 5; 
                                } else {
                                    if (features[2] <= 50.0) {
                                        classes[0] = 1; 
                                        classes[1] = 0; 
                                    } else {
                                        classes[0] = 0; 
                                        classes[1] = 2; 
                                    }
                                }
                            }
                        }
                    }
                }
            } else {
                if (features[2] <= 59.5) {
                    if (features[2] <= 33.5) {
                        if (features[2] <= 31.5) {
                            if (features[1] <= 26.899999618530273) {
                                classes[0] = 3; 
                                classes[1] = 0; 
                            } else {
                                classes[0] = 0; 
                                classes[1] = 2; 
                            }
                        } else {
                            classes[0] = 0; 
                            classes[1] = 10; 
                        }
                    } else {
                        if (features[1] <= 27.5) {
                            if (features[0] <= 9.5) {
                                if (features[2] <= 56.5) {
                                    if (features[1] <= 24.700000762939453) {
                                        if (features[0] <= 7.5) {
                                            classes[0] = 1; 
                                            classes[1] = 0; 
                                        } else {
                                            if (features[0] <= 8.5) {
                                                if (features[1] <= 11.550000190734863) {
                                                    classes[0] = 0; 
                                                    classes[1] = 1; 
                                                } else {
                                                    classes[0] = 5; 
                                                    classes[1] = 0; 
                                                }
                                            } else {
                                                classes[0] = 1; 
                                                classes[1] = 0; 
                                            }
                                        }
                                    } else {
                                        if (features[2] <= 46.5) {
                                            if (features[1] <= 25.700000762939453) {
                                                classes[0] = 2; 
                                                classes[1] = 0; 
                                            } else {
                                                if (features[1] <= 26.649999618530273) {
                                                    classes[0] = 1; 
                                                    classes[1] = 2; 
                                                } else {
                                                    if (features[2] <= 37.0) {
                                                        classes[0] = 0; 
                                                        classes[1] = 1; 
                                                    } else {
                                                        classes[0] = 2; 
                                                        classes[1] = 0; 
                                                    }
                                                }
                                            }
                                        } else {
                                            classes[0] = 0; 
                                            classes[1] = 2; 
                                        }
                                    }
                                } else {
                                    classes[0] = 4; 
                                    classes[1] = 0; 
                                }
                            } else {
                                if (features[2] <= 45.5) {
                                    classes[0] = 8; 
                                    classes[1] = 0; 
                                } else {
                                    if (features[2] <= 51.5) {
                                        classes[0] = 0; 
                                        classes[1] = 1; 
                                    } else {
                                        classes[0] = 2; 
                                        classes[1] = 0; 
                                    }
                                }
                            }
                        } else {
                            if (features[1] <= 39.099998474121094) {
                                if (features[2] <= 42.5) {
                                    if (features[2] <= 35.5) {
                                        if (features[0] <= 10.5) {
                                            if (features[0] <= 9.5) {
                                                classes[0] = 1; 
                                                classes[1] = 0; 
                                            } else {
                                                classes[0] = 0; 
                                                classes[1] = 1; 
                                            }
                                        } else {
                                            classes[0] = 2; 
                                            classes[1] = 0; 
                                        }
                                    } else {
                                        if (features[0] <= 8.5) {
                                            if (features[1] <= 38.25) {
                                                if (features[2] <= 40.5) {
                                                    classes[0] = 0; 
                                                    classes[1] = 6; 
                                                } else {
                                                    if (features[2] <= 41.5) {
                                                        if (features[1] <= 34.099998474121094) {
                                                            classes[0] = 2; 
                                                            classes[1] = 0; 
                                                        } else {
                                                            classes[0] = 0; 
                                                            classes[1] = 4; 
                                                        }
                                                    } else {
                                                        if (features[1] <= 33.75) {
                                                            classes[0] = 0; 
                                                            classes[1] = 1; 
                                                        } else {
                                                            classes[0] = 2; 
                                                            classes[1] = 0; 
                                                        }
                                                    }
                                                }
                                            } else {
                                                classes[0] = 2; 
                                                classes[1] = 0; 
                                            }
                                        } else {
                                            if (features[2] <= 41.5) {
                                                if (features[1] <= 31.150001525878906) {
                                                    classes[0] = 0; 
                                                    classes[1] = 2; 
                                                } else {
                                                    if (features[2] <= 38.5) {
                                                        if (features[1] <= 32.599998474121094) {
                                                            classes[0] = 1; 
                                                            classes[1] = 0; 
                                                        } else {
                                                            if (features[0] <= 12.0) {
                                                                if (features[2] <= 36.5) {
                                                                    classes[0] = 0; 
                                                                    classes[1] = 1; 
                                                                } else {
                                                                    classes[0] = 1; 
                                                                    classes[1] = 0; 
                                                                }
                                                            } else {
                                                                classes[0] = 0; 
                                                                classes[1] = 2; 
                                                            }
                                                        }
                                                    } else {
                                                        if (features[1] <= 37.650001525878906) {
                                                            classes[0] = 11; 
                                                            classes[1] = 0; 
                                                        } else {
                                                            classes[0] = 0; 
                                                            classes[1] = 1; 
                                                        }
                                                    }
                                                }
                                            } else {
                                                classes[0] = 0; 
                                                classes[1] = 2; 
                                            }
                                        }
                                    }
                                } else {
                                    if (features[0] <= 11.5) {
                                        if (features[1] <= 28.25) {
                                            classes[0] = 2; 
                                            classes[1] = 0; 
                                        } else {
                                            if (features[0] <= 10.5) {
                                                if (features[2] <= 48.0) {
                                                    if (features[0] <= 8.5) {
                                                        classes[0] = 0; 
                                                        classes[1] = 6; 
                                                    } else {
                                                        if (features[1] <= 31.799999237060547) {
                                                            classes[0] = 1; 
                                                            classes[1] = 0; 
                                                        } else {
                                                            classes[0] = 0; 
                                                            classes[1] = 7; 
                                                        }
                                                    }
                                                } else {
                                                    if (features[2] <= 51.5) {
                                                        if (features[0] <= 8.5) {
                                                            classes[0] = 6; 
                                                            classes[1] = 0; 
                                                        } else {
                                                            classes[0] = 0; 
                                                            classes[1] = 2; 
                                                        }
                                                    } else {
                                                        classes[0] = 0; 
                                                        classes[1] = 6; 
                                                    }
                                                }
                                            } else {
                                                classes[0] = 2; 
                                                classes[1] = 0; 
                                            }
                                        }
                                    } else {
                                        if (features[0] <= 12.5) {
                                            classes[0] = 0; 
                                            classes[1] = 4; 
                                        } else {
                                            if (features[1] <= 35.650001525878906) {
                                                classes[0] = 1; 
                                                classes[1] = 0; 
                                            } else {
                                                classes[0] = 0; 
                                                classes[1] = 2; 
                                            }
                                        }
                                    }
                                }
                            } else {
                                if (features[0] <= 7.5) {
                                    if (features[1] <= 40.05000305175781) {
                                        classes[0] = 0; 
                                        classes[1] = 5; 
                                    } else {
                                        if (features[1] <= 48.349998474121094) {
                                            classes[0] = 3; 
                                            classes[1] = 0; 
                                        } else {
                                            classes[0] = 0; 
                                            classes[1] = 3; 
                                        }
                                    }
                                } else {
                                    classes[0] = 0; 
                                    classes[1] = 22; 
                                }
                            }
                        }
                    }
                } else {
                    classes[0] = 11; 
                    classes[1] = 0; 
                }
            }
        }
        int class_idx = 0;
        int class_val = classes[0];
        for (int i = 1; i < 2; i++) {
            if (classes[i] > class_val) {
                class_idx = i;
                class_val = classes[i];
            }
        }
        return class_idx;
    }
    
    public static int predict(double[] features) {
        int n_classes = 2;
        int[] classes = new int[n_classes];
        classes[DiabeticClassifier.predict_0(features)]++;
        classes[DiabeticClassifier.predict_1(features)]++;
        classes[DiabeticClassifier.predict_2(features)]++;
        classes[DiabeticClassifier.predict_3(features)]++;
        classes[DiabeticClassifier.predict_4(features)]++;
        classes[DiabeticClassifier.predict_5(features)]++;
        classes[DiabeticClassifier.predict_6(features)]++;
        classes[DiabeticClassifier.predict_7(features)]++;
        classes[DiabeticClassifier.predict_8(features)]++;
        classes[DiabeticClassifier.predict_9(features)]++;
    
        int class_idx = 0;
        int class_val = classes[0];
        for (int i = 1; i < n_classes; i++) {
            if (classes[i] > class_val) {
                class_idx = i;
                class_val = classes[i];
            }
        }
        return class_idx;
    }

    public static void main(String[] args) {
        if (args.length == 3) {

            // Features:
            double[] features = new double[args.length];
            for (int i = 0, l = args.length; i < l; i++) {
                features[i] = Double.parseDouble(args[i]);
            }

            // Prediction:
            int prediction = DiabeticClassifier.predict(features);
            System.out.println(prediction);

        }
    }
}