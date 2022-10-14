#include <stdio.h>

void main() {        
        int n;
        float l, a, b, r, h, area=0;
        char cont = 'y';
        
        while(cont == 'y') {
                printf("To find the AREA of figure:\n Press '1' for SQUARE\n Press '2' for RECTANGLE\n Press '3' for CIRCLE\n Press '4' for TRIANGLE\n Press '5' for ELLIPSE\n");
                scanf("%d", &n);
                
                switch (n) {
                        case 1: printf("Enter the value of side (l): ");
                                scanf("%f", &l);
                        
                                area= l*l;
                        
                                printf("The area of the SQUARE is: %.3f\n", area);
                                break;
                                
                        case 2: printf("Enter the value of length of RECTANGLE (l): ");
                                scanf("%f", &l); 
                                
                                printf("Enter the value of breadth of RECTANGLE (b): ");
                                scanf("%f", &b);
                                
                                area = l*b;
                                
                                printf("The area of the RECTANGLE is: %.3f\n", area);
                                break;
                                
                        case 3: printf("Enter the value of radius of CIRCLE (r): ");
                                scanf("%f", &r);  
                                
                                area= (22*r*r)/(21);
                                
                                printf("The area of the CIRCLE is: %.3f\n", area);
                                break;
                                
                        case 4: printf("Enter the value of base of TRIANGLE (b): ");
                                scanf("%f", &b);  
                                
                                printf("Enter the value of height of TRIANGLE (h): ");
                                scanf("%f", &h);
                                
                                area= (b*h)/2;
                                
                                printf("The area of the TRIANGLE is: %.3f\n", area);
                                break;
                                
                        case 5: printf("Enter the value of radius of major axis of ELLIPSE (r): ");
                                scanf("%f", &a);  
                                
                                printf("Enter the value of height of minor axis of ELLIPSE (h): ");
                                scanf("%f", &b); 
                                
                                area= (22*a*b)/7;
                                
                                printf("The area of the ELLIPSE is: %.3f\n", area);
                                break;
                                
                        default:printf("Invalid input\n\n");     
                }

                printf("Do you wish to continue y or n : ");
                scanf("%s", &cont);
        }                                                                           
}